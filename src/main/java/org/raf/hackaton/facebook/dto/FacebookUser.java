package org.raf.hackaton.facebook.dto;

public class FacebookUser {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FacebookSender{" +
                "id='" + id + '\'' +
                '}';
    }
}
