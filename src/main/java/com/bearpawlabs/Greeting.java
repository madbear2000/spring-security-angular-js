package com.bearpawlabs;

import java.util.UUID;

public class Greeting {

    private String id;

    private String content;

    public Greeting() {
        
        this.id = UUID.randomUUID().toString();
        this.content = "Hello World from Backend";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
