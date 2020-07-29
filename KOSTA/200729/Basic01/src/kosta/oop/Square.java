package kosta.oop;

public class Square extends Rectangle{

	int length;
	
	Square(){
		
	}
	
	public Square(int length) {
		super();
		this.length= length;
		System.out.println("한 변의 길이: "+length+" 넓이: "+surface(length,length));
	}
	
}
