package org.raf.hackaton.facebook.dto;

import java.util.List;

public class FacebookWebhookEntry {

    private String id;
    private Long time;
    private List<FacebookEvent> messaging;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<FacebookEvent> getMessaging() {
        return messaging;
    }

    public void setMessaging(List<FacebookEvent> messaging) {
        this.messaging = messaging;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "FacebookWebhookEntry{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", messaging=" + messaging +
                '}';
    }
}



