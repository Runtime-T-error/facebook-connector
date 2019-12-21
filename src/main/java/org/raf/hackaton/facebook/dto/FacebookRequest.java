package org.raf.hackaton.facebook.dto;

import java.util.Map;

public class FacebookRequest<T> {
    private String uri;
    private Map<String, String> qs;
    private String method;
    private T json;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Map<String, String> getQs() {
        return qs;
    }

    public void setQs(Map<String, String> qs) {
        this.qs = qs;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public T getJson() {
        return json;
    }

    public void setJson(T json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "FacebookRequest{" +
                "uri='" + uri + '\'' +
                ", qs=" + qs +
                ", method='" + method + '\'' +
                ", json=" + json +
                '}';
    }
}
