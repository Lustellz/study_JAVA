package kosta.mission;

import java.util.Scanner;

//perform CRUD
public class BoardService {
	// 상태: Board[] arr
	// 행동: 추가, 전체 출력 기능(CRUD)
	Board list[];
	static int seq = 0;

	BoardService() {
		list = new Board[10];
	}

	Scanner input = new Scanner(System.in);

	public void createBoard() {
		// 정보를 입력 받으세요.
		// 생성되는 Board 객체의 인덱스는 변수입니다.
		System.out.println("글 제목을 입력하세요.");
		String title = input.nextLine();
		System.out.println("작성자를 입력하세요.");
		String writer = input.nextLine();
		System.out.println("글 내용을 입력하세요.");
		String contents = input.nextLine();
		list[seq] = new Board(seq, title, writer, contents);
		seq++;
	}

	public void getBoardList() {
		// 배열에 존재하는 모든 BoardInfo를 출력하세요.
		for (int i = 0; i < seq; i++)
			list[i].getList();
	}

	public void getBoard(int seq) {
		for (int i = 0; i < seq; i++) {
			if (seq == list[i].getSeq()) {
				list[i].show();
				list[i].setHitcount(list[i].getHitcount() + 1);
				return;
			} else
				System.out.println("존재하지 않는 게시글입니다.");
			return;
		}
	}

	public void deleteBoard(int seq) {
		for (int i = 0; i < seq - 1; i++) {
			if (seq == list[i].getSeq()) {
				list[i].show();
				list[i] = list[i + 1];
			}

			else
				System.out.println("존재하지 않는 게시글입니다.");
			return;
		}
		System.out.println(seq + "글이 삭제되었습니다.");
		list[seq - 1] = null;
		seq--;
		return;

	}

	public void updateBoardInfo(int seq) {
		for (int i = 0; i < seq; i++) {
			if (seq == list[i].getSeq()) {
				System.out.println("수정할 제목을 입력하세요.");
				String title = input.nextLine();
				System.out.println("수정할 내용을 입력하세요.");
				String contents = input.nextLine();
				list[i].setTitle(title);
				list[i].setContents(contents);
				return;
			} else
				System.out.println("존재하지 않는 게시글입니다.");
			return;
		}
	}
}
