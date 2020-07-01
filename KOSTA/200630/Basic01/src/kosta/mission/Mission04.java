package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void verification(int res) {
		switch(res) {
		
		case 1:
			System.out.println("로그인 성공");
			break;
		case 2:
			System.out.println("비밀번호가 틀렸습니다.");
			break;
		case 3:
			System.out.println("존재하지 않는 아이디입니다");
			break;
		}
	}
	
	public static void main(String[] args) {
		//키보드로 id, password를 입력받아 id, password가 일치하면 로그인 성공, id 불일치하면 해당 id가 존재하지 않습니다. password 불일칯하면 비밀번호가 일치하지 않습니다.

		String m_id="kosta";
		String m_password="1234";
		String id;
		String password;
		System.out.println("ID를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		id=sc.nextLine();
		if(!id.equals(m_id)) {
			verification(3);
			return;
		}
		System.out.println("password를 입력하세요. ");
		password=sc.nextLine();
		if(!password.contentEquals(m_password))
		{
			verification(2);
			return;
		}
		verification(1);
		
	}

}
