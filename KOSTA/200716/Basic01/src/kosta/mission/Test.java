package kosta.mission;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int setting = input.nextInt();
	
	int arr[]=new int[setting];
	System.out.println(arr.length);
	System.out.println(setting);
	
	Scanner sc = new Scanner(System.in);
	String strr[]=new String[10];
	int cnt=0;
	while(true) {
		System.out.println("입력: ");
		String str=sc.nextLine();
		if(str.contentEquals("q")) break;
		strr[cnt++]=str;
	}
	
	for(int i=0;i<cnt;i++) {
		System.out.print(strr[i]+" ");
	}
	
	}
	
}
