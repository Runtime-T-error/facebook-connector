package org.raf.hackaton.facebook.endpoints;

import org.raf.hackaton.facebook.Configuration;
import org.raf.hackaton.facebook.dto.FacebookEvent;
import org.raf.hackaton.facebook.dto.FacebookWebhook;
import org.raf.hackaton.facebook.service.WebhookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("webhook")
public class WebhookEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(WebhookEndpoint.class);

    private final Configuration config;
    private final WebhookService webhookService;

    public WebhookEndpoint(Configuration config, WebhookService webhookService) {
        this.config = config;
        this.webhookService = webhookService;
    }

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> webhook(@RequestParam(value = "hub.mode", required = true) String hubMode,
                                     @RequestParam(value = "hub.verify_token",required = true) String hubVerifyToken,
                                     @RequestParam(value = "hub.challenge",required = true) String hubChallenge) {

        logger.info("{0} {1} {2}", hubMode, hubVerifyToken, hubChallenge);

        if (hubMode.equals("subscribe") && hubVerifyToken.equals(config.getToken())) {
            logger.info("Token verified.");

            return ResponseEntity.ok(hubChallenge);
        }
        logger.error("Unable to verify token or hub mode.");
        return ResponseEntity.ok().build();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postWebhook(@RequestBody FacebookWebhook facebookWebhook) {
        if ("page".equals(facebookWebhook.getObject())) {
            facebookWebhook.getEntry().forEach(entry -> {
                FacebookEvent webhookEvent = entry.getMessaging().get(0);

                logger.info("Sender PSID: " + webhookEvent.getSender().getId());

                if (!StringUtils.isEmpty(webhookEvent.getMessage())) {
                    webhookService.handleMessage(webhookEvent.getSender().getId(), webhookEvent.getMessage());
                }
                else if (!StringUtils.isEmpty(webhookEvent.getPostback())) {
                    webhookService.handlePostback(webhookEvent.getSender().getId(), webhookEvent.getPostback());
                }
            });
            return ResponseEntity.ok().body("EVENT_RECEIVED");
        }

        return ResponseEntity.notFound().build();
    }



}
