package kosta.video;

public class Video {
	private int v_no;
	private String title;
	private String stars[];
	
	public int getV_no() {
		return v_no;
	}
	public void setV_no(int v_no) {
		this.v_no = v_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getStars() {
		return stars;
	}
	public void setStars(String[] stars) {
		this.stars = stars;
	}
	
	Video(){};
	
	Video(int v_no, String title, String[] stars){
		this.v_no=v_no;
		this.title = title;
		this.stars = stars;
	}
}
