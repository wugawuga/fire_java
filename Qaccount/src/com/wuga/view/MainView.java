package com.wuga.view;

import com.wuga.dto.Account;
import com.wuga.main.Main;

public class MainView {

	// 싱글톤
	private MainView() {}
	private static MainView mv = new MainView();
	public static MainView getInstance() {
		return mv;
	}
	// --------------------------------------
	public int mainMenu() { // 메인 메뉴를 보여주는 뷰
		System.out.println("우가은행에 오신 것을 환영해요");
		System.out.println("메뉴를 선택해요");
		System.out.println("1. 계좌 생성");
		System.out.println("2. 계좌 조회");
		System.out.println("3. 프로그램 종료");
		System.out.print(">> ");
		
		return Integer.parseInt(Main.sc.nextLine()); // 숫자를 입력
		// Main.sc.nextLine();
		
	}
	
	public Account inputAccount() {
		System.out.println("계좌를 생성해요");
		System.out.println("예금주 이름을 입력해요");
		String userName = Main.sc.nextLine();
		System.out.println("계좌 번호를 입력해요");
		String accountNum = Main.sc.nextLine();
		System.out.println("초기 입금액을 입력해요");
		int money = Integer.parseInt(Main.sc.nextLine());
		
		return new Account(userName, accountNum, money);
	}
	
	// 계좌 조회 기능 : 계좌번호를 입력 받기
	public String selectAccountNumber() {
		System.out.println("계좌를 조회해요");
		System.out.println("계좌번호를 입력해요");
		return Main.sc.nextLine();
	}
	
	public void err() { // 입력 오류에 대한 정보를 표기하는 뷰
		System.out.println("잘못 입력했어요. \n다시 확인해 주세요");
	}
	
	public String exit() {
		System.out.println("프로그램을 종료하시겠어요?(y/n)");
		System.out.print(">> ");
		String selectExit = Main.sc.nextLine();
		return selectExit;
	}
	public void nullAccount() { // 계좌가 없는 경우
		System.out.println("해당 계좌번호를 찾울 수 없어요");
		System.out.println("다시 입력해요");
		
	}
	
}
