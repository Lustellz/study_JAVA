package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&characterEncoding=utf8&useUnicode=true&zeroDateTimeBehavior=convertToNull";
			String dbID = "root";
			String dbPassword = "admin";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(String email, String password) {
		String SQL = "SELECT password FROM member WHERE email = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(password)) 
					return 1; //로그인 success
						else
					return 0; //password wrong
				
			}
			return -1; //아이디 X
		}catch(Exception e){
			e.printStackTrace();
		}
		return -2; //DB Error
	}
	
	public int join(User user) {
		String SQL = "INSERT INTO member VALUES(?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,  user.getEmail());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getAuthor_name());
			pstmt.setString(4, user.getDetails());
			return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
}
