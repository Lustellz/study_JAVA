package com.poc_proj.event.service;
import java.util.List;

public interface IMemberService {
	
	public List<?> getBagicDB(String memID);
	void insertAttendedDate(String memID);
}
