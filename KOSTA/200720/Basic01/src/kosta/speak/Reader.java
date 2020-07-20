package kosta.speak;

public class Reader extends Man implements Speakable {

	Reader(){
		super();
	}
	
	Reader(String name){
		super.setName(name);
	}
	
	@Override
	public String speak() {
		return super.getName()+"자바화이팅";
	}

}
