package org.raf.hackaton.facebook.dto;

public class FacebookEvent {
    private FacebookUser sender;
    private FacebookUser recipient;
    private FacebookMessage message;
    private String postback;

    public String getPostback() {
        return postback;
    }

    public void setPostback(String postback) {
        this.postback = postback;
    }

    public FacebookMessage getMessage() {
        return message;
    }

    public void setMessage(FacebookMessage message) {
        this.message = message;
    }

    public FacebookUser getSender() {
        return sender;
    }

    public void setSender(FacebookUser sender) {
        this.sender = sender;
    }

    public FacebookUser getRecipient() {
        return recipient;
    }

    public void setRecipient(FacebookUser recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "FacebookMessage{" +
                "sender=" + sender +
                ", recipient=" + recipient +
                '}';
    }
}
