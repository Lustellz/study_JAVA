package kosta.oop3;

public class Main {

	public static void main(String[] args) {
		Worker work = new Worker();
		Student student = new Student();
		
		Worker2 work2 = new Worker2();
		Student2 student2 = new Student2();

		Person p = new Person("홍길동",work);
		p.doIt();
		p.setRole(student);
		p.doIt();
		
		Person p2 = new Person("대길이",work2);
		p2.getRole2().doIt();
		
		Role r =new Role() {
			
			@Override
			public void doIt() {
				System.out.println("이렇게 살지 마세요.");
				
			}
		};
		
		p.setRole(r);
		p.doIt();
	}

}
