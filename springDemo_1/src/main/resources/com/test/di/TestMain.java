package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String confLoc = "classpath:/test.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		TestDao testDao =ctx.getBean("TestDAOImp",TestDAOImp.class);
		System.out.println("=====");
		testDao.printMsg();
		System.out.println("====="); 
	}

}
