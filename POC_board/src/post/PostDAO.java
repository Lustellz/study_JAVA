package post;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PostDAO {

	private Connection conn;
	private ResultSet rs;

	public PostDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&characterEncoding=utf8&useUnicode=true&zeroDateTimeBehavior=convertToNull";
			String dbID = "root";
			String dbPassword = "admin";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getNext() {
		String SQL = "SELECT idx FROM post ORDER BY idx DESC";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}

			return 1; // 첫 번째 게시물
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // db 오류
	}

	public int write(String author_name, String title, String content) {
		String SQL = "INSERT INTO post(idx, created_at, author_name, title, content) VALUES(?, Now(), ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext());
			pstmt.setString(2, author_name);
			pstmt.setString(3, title);
			pstmt.setString(4, content);

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // db 오류
	}

	public ArrayList<Post> getList(int pageNum) {
		String SQL = "SELECT * FROM post WHERE idx<? ORDER BY idx DESC LIMIT 5";
		ArrayList<Post> post_list = new ArrayList<Post>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext() - (pageNum - 1) * 5);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Post post = new Post();
				post.setIdx(rs.getInt(1));
				post.setCreated_at(rs.getDate(2));
				post.setUpdated_at(rs.getDate(3));
				post.setAuthor_name(rs.getString(4));
				post.setTitle(rs.getString(5));
				post.setContent(rs.getString(6));
				post.setFilename(rs.getString(7));
				post.setRealpath(rs.getString(8));
				post.setFilesize(rs.getInt(9));
				post.setDownloadcount(rs.getInt(10));
				post.setHitcnt(rs.getInt(11));
				post_list.add(post);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return post_list;
	}

	public boolean nextPage(int pageNum) {
		String SQL = "SELECT * FROM post WHERE idx<?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext() - (pageNum - 1) * 10);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Post getPost(int idx) {

		String SQL = "SELECT * FROM post WHERE idx = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Post post = new Post();
				post.setIdx(rs.getInt(1));
				post.setCreated_at(rs.getDate(2));
				post.setUpdated_at(rs.getDate(3));
				post.setAuthor_name(rs.getString(4));
				post.setTitle(rs.getString(5));
				post.setContent(rs.getString(6));
				post.setFilename(rs.getString(7));
				post.setRealpath(rs.getString(8));
				post.setFilesize(rs.getInt(9));
				post.setDownloadcount(rs.getInt(10));
				post.setHitcnt(rs.getInt(11));
				return post;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int update(int idx, String title, String content) {
		String SQL = "UPDATE post SET title=?, content=? updated_at=Now() WHERE idx=?";
		try {

			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(4, idx);

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // db 오류
	}

	public int delete(int idx) {
		String SQL = "DELETE FROM post WHERE idx=?";
		try {

			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, idx);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // db 오류

	}

	public void updateHit(int idx) {
		String SQL = "UPDATE post SET hitcnt=hitcnt+1 WHERE idx=?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate(); // 실행 -> 조회수 1증가

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
