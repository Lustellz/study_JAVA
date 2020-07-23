package kosta.thread;

public class MainThread {

	public static void main(String[] args) {
		Thread threadA = new AThread();
		Thread threadB = new BThread();

		NumThread t1 = new NumThread(1, 50);
		NumThread t2 = new NumThread(51, 100);
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		threadB.start();
		threadA.start();
		try {
			threadB.join();
			threadA.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int result = ((AThread) threadA).sum + ((BThread) threadB).sum;
		System.out.println(result);
	}
}
