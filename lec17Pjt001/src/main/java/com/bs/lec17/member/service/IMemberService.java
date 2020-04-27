package com.bs.lec17.member.service;
import java.util.Map;
import com.bs.lec17.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	Member memberSearch(Member member);
	Member memberModify(Member member);
	void memberRemove(Member member);
}
