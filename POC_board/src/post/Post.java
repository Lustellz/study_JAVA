package post;

import java.sql.Date;

public class Post {
	private int idx;
	private Date created_at;
	private Date updated_at;
	private String author_name;
	private String title;
	private String content;
	private String filename;
	private String realpath;
	private int filesize;
	private int downloadcount;
	private int hitcnt;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getRealpath() {
		return realpath;
	}
	public void setRealpath(String realpath) {
		this.realpath = realpath;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public int getDownloadcount() {
		return downloadcount;
	}
	public void setDownloadcount(int downloadcount) {
		this.downloadcount = downloadcount;
	}
	public int getHitcnt() {
		return hitcnt;
	}
	public void setHitcnt(int hitcnt) {
		this.hitcnt = hitcnt;
	}
}
