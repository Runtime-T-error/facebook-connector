package org.raf.hackaton.facebook.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class SendEndpoint {

    @PostMapping()
    public ResponseEntity<?> sendMessage() {
        return ResponseEntity.ok().build();
    }

}
