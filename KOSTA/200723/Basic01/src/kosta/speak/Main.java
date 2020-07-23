package kosta.speak;

public class Main {

	public static void main(String[] args) {
		Object obj[]= {new Reader("둘리 "),new Work("길동 "), new Student("마이콜 ")};

		for(int i=0;i<obj.length;i++) {
			if(obj[i] instanceof Speakable) {
				Speakable s = (Speakable) obj[i];
				System.out.println(s.speak());
			}
		}

	}

}
