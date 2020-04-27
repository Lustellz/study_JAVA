package com.board.enums;

public enum PostType {

	urgent("중요"),
	 notice("공지"),
	    free("자유");

	    private String value;

	    PostType(String value) {
	        this.value = value;
	    }
	    public String getValue() {
	        return value;
	    }
	
}
