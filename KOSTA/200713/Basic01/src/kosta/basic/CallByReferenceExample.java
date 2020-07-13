package kosta.basic;

import java.util.Arrays;

public class CallByReferenceExample {
	
	public static boolean equals(int num1[], int num2[]) {
//        if (num1==num2)
//            return true;
//        if (num1==null || num2==null)
//            return false;
//
//        int length = num1.length;
//        if (num2.length != length)
//            return false;
//
//        for (int i=0; i<length; i++)
//            if (num1[i] != num2[i])
//                return false;
//
//        return true;
		
		boolean result = false;
		if(Arrays.equals(num1,num2))
			result=true;
		return result;
	}
	
	public static void change(int num) {
		num--;
	}
	
	public static void change2(int arr[]) {
		arr[0]=300;
	}
	
	public static void main(String[] args) {
		// Call By Value: 값에 의한 호출
		int num = 100;
		
		//Call By Reference: 주소값에 의한 호출
		int arr[]= {10};
		change(num);
//		num=change(num);
		change2(arr);
//		System.out.println(num);
		System.out.println(arr[0]);
		System.out.println(num);
		
		int num1[]= {1,2,3,4};
		int num2[]= {1,2,3,4,5};

		if(equals(num1,num2)!=false) 
			System.out.println("서로 같다.");
		else
			System.out.println("서로 다르다.");
		
	}

}
