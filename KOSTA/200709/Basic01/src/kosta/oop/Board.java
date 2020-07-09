package kosta.oop;

import java.time.LocalDateTime;
import java.util.Date;

public class Board {

	Long id;
	String title;
	String author;
	String content;
	Date created;
	int hit;
	
	public void write(String title, String author, String content) {
		System.out.println(this.id);
		System.out.println("제목: "+title);
		System.out.println("작성자: "+author);
		System.out.println(LocalDateTime.now());
		System.out.println("내용: "+content);
		System.out.println("조회 수: "+this.hit);
	}
	
}
