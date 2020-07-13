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

	GeneralMember() {
	};

	GeneralMember(String id, String name, String address, Video[] loaned) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.loaned = loaned;

		System.out.println("회원의 아이디: " + id);
		System.out.println("회원의 이름: " + name);
		System.out.println("주소: " + address);

		for (int i = 0; i < loaned.length; i++) {
			System.out.println("회원이 대여한 비디오 번호: " + loaned[i].getV_no());
			System.out.println("회원이 대여한 비디오 제목: " + loaned[i].getTitle());
			for (int j = 0; j < loaned[i].getStars().length; j++)
				System.out.println("회원이 대여한 비디오 출연자들: " + loaned[i].getStars()[j]);
		}
	}
}
