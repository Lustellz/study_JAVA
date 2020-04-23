package com.board.deploy.enums;

public enum PostType {
    notice("공지"),
    urgent("긴급"),
    free("자유");

    private String value;

    PostType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}