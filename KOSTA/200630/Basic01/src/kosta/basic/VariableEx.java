package kosta.basic;

public class VariableEx {

	public static void main(String[] args) {
		int num1=1000000000; //변수 선언과 초기화
		
		float num3=3.14f;
		float num2=(float) 3.14;
		double num4 = 3.14;
		
		char char1='C';
		
		String chars="String";
		
		boolean bool1 = true;
		boolean bool2 = false;
		//형변환(Casting): 기본형 데이터형(byte, short, int, long, float, double)
		//byte<short<int<long<float<double
		
		int num5=10;
		double num6=3.14;
		
		int num7 = (int) (num5+num6);//명시적 형변환(데이터 손실 발생)
		
		//문자열과 다른 데이터의 형변환
		//String>다른 데이터 타입
		
		String strings = 7+7+"6";
		strings = 7+"6"+7;
		
		int x = 10;
		int y = 0;
		
		y=x++;
		y=++x;
		int z=10;
		
		System.out.println("x: "+x); //11
		System.out.println("y: "+y); //10
		System.out.println("z: "+ ++z);
		System.out.println("z: "+ z++);
		
		int score = 85;
		char grade =(score>90)?'A':((score>90)?'B':'F');
		
		System.out.println(grade);
	}

}
