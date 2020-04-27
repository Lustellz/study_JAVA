package com.poc_proj.event.model;

import java.util.List;

public interface IMemberAuthDAO {

	public MemberDetails selectMember(String memID); 
	
	public void insertAttendedDate(String memID);

	public List<?> selectAttended(String memID) ;
	
}

