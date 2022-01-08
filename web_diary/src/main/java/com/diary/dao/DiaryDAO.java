package com.diary.dao;

import java.beans.Statement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.diary.vo.DiaryVO;

public class DiaryDAO {

	private DiaryDAO() {}

	private static DiaryDAO dao = new DiaryDAO();
	public static DiaryDAO getInstance() {
		return dao;
	}

	public Connection getConnection() {
		Connection conn = null;

		try {

			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();

		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public List<DiaryVO> selectAlldiary(String userid) {

		DiaryVO dVo = null;
		String sql = "SELECT * FROM DIARY_BOARD WHERE USERID=?";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		List<DiaryVO> dList = new ArrayList<>();

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userid);

			rs = psmt.executeQuery();

			while(rs.next()) {
				dVo = new DiaryVO();

				dVo.setDiaryCode(rs.getInt("DIARYCODE"));
				dVo.setUserid(rs.getString("USERID"));
				dVo.setTitle(rs.getString("TITLE"));
				dVo.setContent(rs.getString("CONTENT"));
				dVo.setDiaryDate(rs.getDate("DIARYDATE").toString());

				dList.add(dVo);

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null ) rs.close();
				if(psmt != null ) psmt.close();
				if(conn != null ) conn.close();
			}catch(Exception e) {}
		}

		return dList;
	}

	public void writeDiary(DiaryVO dVo) {

		String sql = "INSERT INTO DIARY_BOARD VALUES(DIARY_SEQ.NEXTVAL,?,?,?,SYSDATE)";

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dVo.getUserid());
			psmt.setString(2, dVo.getTitle());
			psmt.setString(3, dVo.getContent());

			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null ) psmt.close();
				if(conn != null ) conn.close();
			}catch(Exception e) {}
		}
	}

	public DiaryVO selectDiaryByCode(int diaryCode) {

		DiaryVO dVo = null;
		String sql = "SELECT * FROM DIARY_BOARD WHERE DIARYCODE=?";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, diaryCode);
			rs = psmt.executeQuery();

			if(rs.next()) {
				dVo = new DiaryVO();

				dVo.setDiaryCode(rs.getInt("DIARYCODE"));
				dVo.setTitle(rs.getString("TITLE"));
				dVo.setUserid(rs.getString("USERID"));
				dVo.setDiaryDate(rs.getString("DIARYDATE"));
				dVo.setContent(rs.getString("CONTENT"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(psmt != null ) psmt.close();
				if(conn != null ) conn.close();
			}catch(Exception e) {}
		}
		return dVo;
	}

	public void deleteDiary(int diaryCode) {

		String sql = "DELETE FROM DIARY_BOARD WHERE DIARYCODE=?";

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, diaryCode);
			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null ) psmt.close();
				if(conn != null ) conn.close();
			}catch(Exception e) {}
		}
	}

	public void updateDiary(DiaryVO dVo) {

		String sql = "UPDATE DIARY_BOARD SET TITLE=?, CONTENT=?, DIARYDATE=SYSDATE WHERE DIARYCODE=?";

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dVo.getTitle());
			psmt.setString(2, dVo.getContent());
			psmt.setInt(3, dVo.getDiaryCode());

			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null ) psmt.close();
				if(conn != null ) conn.close();
			}catch(Exception e) {}
		}
	}

}