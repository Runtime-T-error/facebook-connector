package org.raf.hackaton.facebook.service;

import org.raf.hackaton.facebook.dto.FacebookMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class WebhookService {


    public void handlePostback(String id, String postback) {
    }

    public void handleMessage(String id, FacebookMessage message) {


    }
}
