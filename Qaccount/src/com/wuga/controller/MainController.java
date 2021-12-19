package com.wuga.controller;

import com.wuga.dao.AccountDAO;
import com.wuga.dto.Account;
import com.wuga.view.MainView;

public class MainController {

	
	public MainController()	{
		mainMenu();
	}
	
	private MainView mv = MainView.getInstance(); // 뷰
	private AccountDAO dao = AccountDAO.getInstance(); // 데이터 저장

	private void mainMenu() { // 메인 로직을 담당하는 메서드 : 계좌생성, 계좌인증
		
		boolean run = true;
		
		while(run) {
			int selectmenu = mv.mainMenu();
			
			switch(selectmenu) {
			case 1: // 계좌 생성
				createAccount();
				break;
			case 2: // 계좌 조회
				accessAccount();
				break;
			case 3: // 프로그램 종료
				String selectExit = mv.exit();
				run = exit(selectExit);
				break;
			default:
				mv.err();
			}
		}
	}
	
	private void accessAccount() {
		String accountNumber = mv.selectAccountNumber();
		Account account = dao.selectAccountNumber(accountNumber);
		if(account == null) {
			mv.nullAccount();
		}else {
			new AccountController(account);
		}
	}

	private void createAccount() {
		Account newAcc = mv.inputAccount();
		dao.insertAccount(newAcc);
	}

	private boolean exit(String selectExit) {
		if(selectExit.equals("y")) {
			return false;
		}else if(selectExit.equals("n")) {
			return true;
		}else {
			mv.err();
			return true;
		}
	}
}
