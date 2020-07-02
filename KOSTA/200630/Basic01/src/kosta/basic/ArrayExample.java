package kosta.basic;

public class ArrayExample {

	public static void main(String[] args) {
		// 1. 배열선언. 생성 분리
		int arr[]; // 배열 선언: 주소값을 넣을 수 있는 변수가 생성
		arr = new int[5];//배열 생성: int형 변수 생성. 생성된 주소를 arr에 대입
		
		//2. 배열선언, 생성 동시
		int arr2[]=new int[5];
		
		//2. 배열 선언, 생성, 초기화 동시
		int arr3[]= {1,2,3,4,5};
		
		//for문을 이용해서 전체 배열요소를 출력하자.
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr3["+i+"]= "+arr3[i]);
		}
		
		for(int n: arr3) {
			System.out.print(n+", ");
		}
		//1. 배열에 사용될 데이터타입은 무엇인가?
		//2. 배열의 크기를 결정 -> 초과사용 -> ArrayIndexOutOfBoundsException
		//3. 배열을 어떻게 초기화하는가(index, for문, 생성과 동시에)
		//4. 배열에 있는 데이터 출력(for문, 향상된 for문)
	}

}
