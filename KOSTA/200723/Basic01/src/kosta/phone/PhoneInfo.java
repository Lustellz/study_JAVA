package kosta.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	private String name;
	private String phoneNo;
	private String birthday;
	
	PhoneInfo(){};
	
	//기능: 1명의 전화내역 출력하기
	public void show() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNo);
		System.out.println("생년월일: "+birthday);
		System.out.println();
	}
	
	public PhoneInfo(String name, String phoneNo, String birthday) {
		super();
		this.name = name;
		this.phoneNo=phoneNo;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
