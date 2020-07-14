package kosta.mission;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");

	private String title;
	private String writer;
	private String contents;
	private String regdate;
	private int hitcount;
	private int seq;

	public Date getRegdate() {
		return new Date();
	}

	public void setRegdate(Date regdate) {
		this.regdate = format.format(this.getRegdate());
	}
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount= hitcount;
	}

	Board() {
	};

	// 기능: 게시글 1개 출력하기
	public void show() {
		System.out.println("글 번호: " + seq);
		System.out.println("글 제목: " + title);
		System.out.println("작성자: " + writer);
		System.out.println("글 내용: " + contents);
		System.out.println("작성일자: " + regdate);
		System.out.println("조회 수: " + hitcount);
		System.out.println();
	}

	public void getList() {
		System.out.println("글 번호: " + seq);
		System.out.println("글 제목: " + title);
		System.out.println("작성자: " + writer);
		System.out.println("작성일자: " + regdate);
		System.out.println("조회 수: " + hitcount);
		System.out.println();
	}

	public Board(int seq, String title, String writer, String contents) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}

}
