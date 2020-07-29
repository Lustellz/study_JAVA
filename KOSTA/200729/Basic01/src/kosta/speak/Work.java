package kosta.speak;

public class Work extends Man implements Speakable {

	Work(){}
	
	Work(String name){
		super.setName(name);
	}
	
	@Override
	public String speak() {
		return super.getName()+"열심히 일해야 한다.";
	}

}
