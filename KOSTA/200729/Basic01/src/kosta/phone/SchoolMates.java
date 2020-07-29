package kosta.phone;

public class SchoolMates extends PhoneInfo {

	private int year;
	private String major;
	SchoolMates(){};
	
	public SchoolMates(String name, String phoneNo, String birthday,String major, int year) {
		super(name, phoneNo, birthday);
		this.major=major;
		this.year=year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
