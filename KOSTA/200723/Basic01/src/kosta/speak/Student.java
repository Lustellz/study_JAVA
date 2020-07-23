package kosta.speak;

public class Student extends Man {

	Student(){};
	
	Student(String name){
		super.setName(name);
	}
	public String speak() {
		return super.getName()+"공부나 열심히 해";
	}
}
