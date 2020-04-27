package com.poc_proj.event.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.poc_proj.event.controller.AttendController;
import com.poc_proj.event.model.MemberAuthDAO;
import com.poc_proj.event.model.MemberDetails;

@Service("memSer")
public class MemberService implements IMemberService{
	private static final Logger logger = LoggerFactory.getLogger(AttendController.class);
	
	@Resource(name="memDAO")
	private MemberAuthDAO memDAO;
	
	MemberDetails mem_name = new MemberDetails();
	String memID = mem_name.getUsername();


	@Override
	public List<?> getBagicDB(String memID) {
		// TODO Auto-generated method stub
		List<?> list = memDAO.selectAttended(memID);
		
		for(int position= 0;position <list.size();position++) {
			logger.info("position: "+list.get(position));
		}
		return list;
	}

	@Override
	public void insertAttendedDate(String memID) {
		// TODO Auto-generated method stub
		memDAO.insertAttendedDate(memID);
	}

}
