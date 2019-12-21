package org.raf.hackaton.facebook.dto;

public class FacebookMessageResponse {
    private FacebookUser recipient;
    private FacebookMessage message;

    public FacebookUser getRecipient() {
        return recipient;
    }

    public void setRecipient(FacebookUser recipient) {
        this.recipient = recipient;
    }

    public FacebookMessage getMessage() {
        return message;
    }

    public void setMessage(FacebookMessage message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FacebookMessageResponse{" +
                "recipient=" + recipient +
                ", message=" + message +
                '}';
    }
}
