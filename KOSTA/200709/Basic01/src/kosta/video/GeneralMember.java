package kosta.video;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video loaned[];

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Video[] getVideo() {
		return loaned;
	}
	public void setVideo(Video[] loaned) {
		this.loaned = loaned;
	}
	
	GeneralMember(){};
	
	GeneralMember(String id, String name, String address,Video[] loaned){
		this.id = id;
		this.name = name;
		this.address = address;
		this.loaned = loaned;
	}
	
}
