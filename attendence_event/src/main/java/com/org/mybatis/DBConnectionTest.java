package com.org.mybatis;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DBConnectionTest {
	@Inject
	private DataSource ds;

	public void testConnection() {
		try (Connection con = ds.getConnection()){
			
			System.out.println("\n DB connection successed. \n");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
