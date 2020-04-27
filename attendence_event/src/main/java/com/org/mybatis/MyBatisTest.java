package com.org.mybatis;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MyBatisTest {
	@Inject
	private SqlSessionFactory sqlFactory;

	public void testSession() throws Exception{
		try(SqlSession session = sqlFactory.openSession()){
			System.out.println("session: "+session);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
