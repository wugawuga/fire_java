package com.green.vo;

import java.util.Date;

public class DiaryVO {
	private int diaryCode;
	private String userid;
	private String title;
	private String content;
	private Date DIARYDATE;
	
	
	public int getDiaryCode() {
		return diaryCode;
	}
	public void setDiaryCode(int diaryCode) {
		this.diaryCode = diaryCode;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDIARYDATE() {
		return DIARYDATE;
	}
	public void setDIARYDATE(Date dIARYDATE) {
		DIARYDATE = dIARYDATE;
	}
	
	
}
