package com.bs.lec19.member;

import java.util.List;

public class Member {
	
	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemMail() {
		return memMail;
	}
	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}
	public String getMemPhones() {
		return memPhone;
	}
	public void setMemPhones(List<MemPhone> memPhones) {
		this.memPhones = memPhones;
	}

}