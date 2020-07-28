package kosta.oop3;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		t.start();

		for (int i = 11; i < 21; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
