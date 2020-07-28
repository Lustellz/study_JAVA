package kosta.thread;

public class BThread extends Thread {
	int sum;

	BThread() {
		this.sum = 0;
	}

	public void run() {
		for (int i = 50; i <= 100; i++) {
			this.sum += i;
		}

	}
}
