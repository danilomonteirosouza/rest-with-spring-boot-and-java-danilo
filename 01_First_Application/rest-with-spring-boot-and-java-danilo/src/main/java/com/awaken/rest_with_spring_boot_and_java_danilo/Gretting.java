package com.awaken.rest_with_spring_boot_and_java_danilo;

public class Gretting {
    private final long id;
    private final String content;

    public Gretting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
