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
		GeneralMember g1 = new GeneralMember("aaa", "홍길동", "동탄", g1loaned);
		System.out.println();
		Video s1loaned[]= {v2};
		SpecialMember s1= new SpecialMember("bbb","김철수","서울",s1loaned,10);
		
	}
}
