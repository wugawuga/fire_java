package com.green.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.green.db.DBConnect;
import com.green.vo.CommentVO;

public class CommentDAO {
	private CommentDAO() {}
	private static CommentDAO dao = new CommentDAO();
	public static CommentDAO getInstance() {
		return dao;
	}
	
	public void insertComment(String C_user, String C_comment, String C_password) {
		
		String sql = "INSERT INTO ctbl VALUES(ctbl_seq.nextval,1,?,?,?,sysdate)";
		
		Connection conn = null;
		PreparedStatement csmt = null;
		
		try {
			conn = DBConnect.getConnection();
			csmt = conn.prepareStatement(sql);
			
			csmt.setString(1, C_user);
			csmt.setNString(2, C_comment);
			csmt.setString(3, C_password);
			
			csmt.executeUpdate();
			
		}catch(Exception e) {
			
		}finally {
			DBConnect.close(conn,csmt);
		}
		
	}

	//----------------------------------------------
	public List<CommentVO> selectAllText(){
		List<CommentVO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM ctbl";
		
		Connection conn = null;
		Statement csmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			csmt = conn.createStatement();
			rs = csmt.executeQuery(sql);
			
			while(rs.next()) {
				CommentVO cVo = new CommentVO();
				cVo.setC_code(rs.getInt("C_code"));
				cVo.setB_code(rs.getInt("B_code"));
				cVo.setC_user(rs.getString("C_user"));
				cVo.setC_comment(rs.getString("C_comment"));
				cVo.setC_regDate(rs.getTimestamp("C_regDate"));
				cVo.setC_password(rs.getString("C_password"));
				
				list.add(cVo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnect.close(conn, csmt, rs);
		}
		return list;
	}
	
	public void deleteComment(int C_code) {
		
		String sql = "DELETE FROM ctbl WHERE C_code=?";
	
		Connection conn = null;
		PreparedStatement csmt = null;
		
		try {
			conn = DBConnect.getConnection();
			
			csmt = conn.prepareStatement(sql);
			csmt.setInt(1, C_code);
			csmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnect.close(conn, csmt);
		}
	
	}
	public String pwdFindCode(int C_code) {
		String password = null;
		String sql = "SELECT C_password FROM ctbl WHERE C_code =?";
		
		Connection conn = null;
		PreparedStatement csmt = null;
		ResultSet rs = null; 
		
		try {
			conn = DBConnect.getConnection();
			csmt = conn.prepareStatement(sql);
			csmt.setInt(1, C_code);
			rs = csmt.executeQuery();
			
			if(rs.next()) {
				password = rs.getString("C_password");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnect.close(conn, csmt, rs);
		}
		return password;
	}

}
