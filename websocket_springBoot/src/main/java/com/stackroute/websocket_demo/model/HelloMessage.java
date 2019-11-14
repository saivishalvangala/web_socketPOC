package com.stackroute.websocket_demo.model;

public class HelloMessage {
    private String toName;

    private String fromName;

    private String content;

    public HelloMessage(){

    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
