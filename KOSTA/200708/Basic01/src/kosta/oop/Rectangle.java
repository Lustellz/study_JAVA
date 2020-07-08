package kosta.oop;

public class Rectangle {

	int width;
	int height;
	
	public static int surface(int w, int h) {
		return w*h;
	}
	
	public Rectangle() {
		System.out.print("가로 길이: "+width+" 세로 길이: "+height+" 넓이: "+surface(width,height));
	}

	

}
