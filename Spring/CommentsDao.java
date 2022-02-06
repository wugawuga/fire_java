package com.wuga.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.wuga.vo.CommentsVo;

public class CommentsDao {

	private JdbcTemplate jdbcTemplate;
	
	public CommentsDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public CommentsVo selectByBoardNum(Long boardNum) {
		
		List<CommentsVo> list = jdbcTemplate.query("SELECT * from comments WHERE qnaBoardNum = ?", new RowMapper<CommentsVo>() {

			@Override
			public CommentsVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				CommentsVo comments = new CommentsVo(
						rs.getString("commentContent"),
						rs.getTimestamp("commentRegdate"));
				return comments;
			}}, boardNum);
		
		return list.isEmpty()?null:list.get(0);
	}
}
