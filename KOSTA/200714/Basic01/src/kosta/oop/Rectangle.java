package kosta.oop;

public class Rectangle {

	int width;
	int height;
	
	int surface(int w, int h) {
		return w*h;
	}
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로 길이: "+width+" 세로 길이: "+height+" 넓이: "+surface(width,height));
	}

}
