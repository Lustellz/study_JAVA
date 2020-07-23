package kosta.baseball;

public class Checker {

	private int S = 0;
	private int B = 0;

	public int getS() {
		return S;
	}

	public void setS(int s) {
		S = s;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	Checker() {
	};

	public void check(int g_index, int a_index, int[] g, int[] a) {
		if (a_index > 2) {
			return;
		} else if (g_index == a_index) {
			if (g[g_index] == a[a_index])
				this.S++;
		}
		if (g[g_index] == a[a_index])
			this.B++;

		check(g_index, a_index + 1, g, a);
	}

	Checker(Reader r, Answer a) {

		// 3중 for문
		// limit를 3으로 나눈 나머지로
		for (int i = 0; i < 3; i++)
			check(i, 0, r.getGuess(), a.getAns());
		this.B -= this.S;
	};

}
