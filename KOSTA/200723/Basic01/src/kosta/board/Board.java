package kosta.board;

import java.time.LocalDateTime;

public class Board {

	Long id;
	String title;
	String author;
	String content;
	LocalDateTime created;
	private FileInfo file[] = new FileInfo[5];
	int hit;
	
	public void write(String title, String author, String content, FileInfo[] file) {
		this.title = title;
		this.author = author;
		this.content = content;
		this.created = LocalDateTime.now();
		this.file=file ;
		System.out.println(id);
		System.out.println("제목: "+title);
		System.out.println("작성자: "+author);
		System.out.println("작성일자: "+this.created);
		System.out.println("내용: "+content);
		System.out.println("조회 수: "+this.hit);
	}

	public FileInfo[] getFile() {
		return file;
	}

	public void setFile(FileInfo[] file) {
		this.file = file;
	}
	
}
