package kosta.oop3;

public class Worker extends Role{

	@Override
	public void doIt() {
		System.out.println("Worker 역할");
		print();
	}

}
