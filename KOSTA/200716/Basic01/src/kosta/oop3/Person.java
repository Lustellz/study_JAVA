package kosta.oop3;

public class Person {
	private String name;
	private Role role;
	private Role2 role2;

	public Person() {
	};

	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public Person(String name, Role2 role2) {
		super();
		this.name = name;
		this.role2 = role2;

		System.out.println("출력: ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void doIt() {
		role.doIt();
	}
	
	public Role2 getRole2() {
		return role2;
	}

	public void setRole2(Role2 role2) {
		this.role2 = role2;
	}
	
}
