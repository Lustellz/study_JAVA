package kosta.thread;

public class AThread extends Thread {
	int sum;

	AThread() {
		this.sum = 0;
	}

	public void run() {
		for (int i = 1; i < 50; i++) {
			this.sum += i;
		}

	}
}
