package kosta.thread;

public class MultithreadExample {

	public static void main(String[] args) {

		Thread thread = new DigitThread();
		Thread thread2 = new Thread(new SmallLetters());
		thread.start();
		char arr[] = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };
		for (char ch_ : arr) {
			System.out.print(ch_);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
			
		thread2.start();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
