package kosta.phone;

public class Colleagues extends PhoneInfo {

	private String dept;
	private String pos;
	
	Colleagues(){};

	public Colleagues(String name, String phoneNo, String birthday, String dept, String pos) {
		super(name,phoneNo,birthday);
		this.dept = dept;
		this.pos=pos;
		}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
	
}
