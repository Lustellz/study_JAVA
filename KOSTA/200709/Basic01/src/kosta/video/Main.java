package kosta.video;

public class Main {
	public static void main(String[] args) {

		String stars1[] = { "1", "2", "3" };
		String stars2[] = { "2-1", "2", "3" };
		String stars3[] = { "3-1", "2", "3" };
		String stars4[] = { "4-1", "2", "3" };

		Video v1 = new Video(1, "1", stars1);
		Video v2 = new Video(2, "2", stars2);
		Video v3 = new Video(3, "3", stars3);
		Video v4 = new Video(4, "4", stars4);
		Video v5 = new Video(5, "5", stars3);

		Video g1loaned[] = { v1, v2, v3 };
		GeneralMember g1 = new GeneralMember("1", "2", "3", g1loaned);

		System.out.println("회원의 아이디: " + g1.getId());
		System.out.println("회원의 이름: " + g1.getName());
		System.out.println("주소: " + g1.getAddress());
		for (int i = 0; i < g1.getVideo().length; i++) {
			System.out.println("회원이 대여한 비디오 번호: " + g1.getVideo()[i].getV_no());
			System.out.println("회원이 대여한 비디오 제목: " + g1.getVideo()[i].getTitle());
			for(int j =0;j<g1.getVideo()[i].getStars().length;j++)
				System.out.println("회원이 대여한 비디오 출연자들: "+g1.getVideo()[i].getStars()[j]);
		}
	}
}
