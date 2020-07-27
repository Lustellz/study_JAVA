package kosta.sort;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// 나이를 기준으로 오름차순 정렬을 overriding 해보세요.
		if (this.age < o.getAge())
			return -1;
		else if (this.age > o.getAge())
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return this.name.toString() + this.age;
	}

}
