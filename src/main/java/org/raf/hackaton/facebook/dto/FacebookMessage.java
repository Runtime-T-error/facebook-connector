package org.raf.hackaton.facebook.dto;

public class FacebookMessage {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "FacebookMessage{" +
                "text='" + text + '\'' +
                '}';
    }
}
