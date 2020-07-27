package kosta.lamda;

public class LamdaExample {

	public static void main(String[] args) {
		// 익명내부 클래스
		MyType my1 = new MyType() {
			@Override
			public void hello() {
				System.out.println("익명 내부 클래스 형식");
			}
		};
		my1.hello();

		// 람다식으로 익명 메서드 생성
		MyType my2 = () -> System.out.println("람다식 형식");
		my2.hello();

		YourType yt = (msg) -> System.out.println("your Type " + msg);
		yt.talk("웅앵웅");

		MyNumber mn = (n1, n2) -> n1 > n2 ? n1 : n2;
		System.out.println(mn.getMax(10, 20));

		// Runnable로 람다식 1~10을 출력하세요.

		Lamd_thread lt = () -> {
			for (int i = 1; i < 11; i++)
				System.out.print(i + " ");
		};

		lt.run();

		// Runnable r = ()->{
		// for (int i =1; i<=10;i++)
		// System.out.println(i);
		// };
		//Thread t = new Thread(r);
		//t.start();
	}

}
