package com.poc_proj.event.model;

import java.util.ArrayList;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memDAO")
public class MemberAuthDAO implements IMemberAuthDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace = "member";
	
	@Override
	public MemberDetails selectMember(String memID) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".selectMember",memID);
	}

	@Override
	public void insertAttendedDate(String memID) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertAttendedDate",memID);
	}

	@Override
	public List<?> selectAttended(String memID) {
		// TODO Auto-generated method stub
		List<?> attended = new ArrayList<MemberDetails>();
		System.out.println("출석일 갖고 옴");
		attended = sqlSession.selectList(namespace+".selectAttended",memID);
		return attended;
	}
	
}
