package com.green.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


import oracle.jdbc.proxy.annotation.Pre;

public class DiaryDAO {
	
	private DiaryDAO() {}
	private static DiaryDAO dao = new DiaryDAO();
	public static DiaryDAO getInstance() { return dao; }
	
	// 연결 객체를 얻어오기 위한 메소드
	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/mysql");
			conn = ds.getConnection();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
