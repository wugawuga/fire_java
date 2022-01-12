package com.wuga.controller;

import com.wuga.controller.action.CourseWriteFormAction;
import com.wuga.controller.action.LecturerListAction;
import com.wuga.controller.action.LecturerUpdateAction;
import com.wuga.controller.action.LecturerUpdateFormAction;
import com.wuga.controller.action.LecturerWriteAction;
import com.wuga.controller.action.LecturerWriteFormAction;
import com.wuga.controller.action.CourseWriteAction;
import com.wuga.controller.action.CourseViewAction;
import com.wuga.controller.action.Action;
import com.wuga.controller.action.CourseDeleteAction;
import com.wuga.controller.action.CourseListAction;
import com.wuga.controller.action.CourseUpdateAction;
import com.wuga.controller.action.CourseUpdateFormAction;

public class ActionFactory {
	
	private ActionFactory() {};
	private static ActionFactory af = new ActionFactory();
	public static ActionFactory getInstance() {
		return af;
	}
	public Action getAction(String command){
		
		Action action = null;
		
		if(command.equals("course_list")) {
			action = new CourseListAction();
		}else if(command.equals("course_write_form")) {
			action = new CourseWriteFormAction();
		}else if(command.equals("course_write")) {
			action = new CourseWriteAction();
		}else if(command.equals("course_view")) {
			action = new CourseViewAction();
		}else if(command.equals("course_delete")) {
			action = new CourseDeleteAction();
		}else if(command.equals("course_update_form")) {
			action = new CourseUpdateFormAction();
		}else if(command.equals("course_update")) {
			action = new CourseUpdateAction();
		}else if(command.equals("lecturer_list")) {
			action = new LecturerListAction();
		}else if(command.equals("lecturer_update_form")) {
			action = new LecturerUpdateFormAction();
		}else if(command.equals("lecturer_update")) {
			action = new LecturerUpdateAction();
		}else if(command.equals("lecturer_write_form")) {
			action = new LecturerWriteFormAction();
		}else if(command.equals("lecturer_write")) {
			action = new LecturerWriteAction();
		}
		return action;
	}
}
