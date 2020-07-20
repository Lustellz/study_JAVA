package kosta.mission;

public abstract class Dao {

	public abstract void insert();
	
	public void msg() {
		System.out.println("Dao performed");
	}
}
