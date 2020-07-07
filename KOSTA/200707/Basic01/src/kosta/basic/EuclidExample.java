package kosta.basic;

public class EuclidExample {

	static int gcd(int x, int y) {
		int big;
		int small;
		if(x>y)
		{
			big = x;
			small = y;
		}else {
			big=y;
			small=x;
		}
		
		if (small!=0) 
			return gcd(small, big%small);
		else
			return big;
		
	}
	
	public static void main(String[] args) {
		// 임의의 정수를 입력받아 재귀 함수로 유클리드 호제법을 구현하세요.
		
		int x=10;
		int y=4;
		
		System.out.println("최대공약수: "+gcd(x,y));
	}

}
