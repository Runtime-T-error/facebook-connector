package org.raf.hackaton.facebook.dto;

import java.util.List;

public class FacebookWebhook {

    private String object;
    private List<FacebookWebhookEntry> entry;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<FacebookWebhookEntry> getEntry() {
        return entry;
    }

    public void setEntry(List<FacebookWebhookEntry> entry) {
        this.entry = entry;
    }
}
