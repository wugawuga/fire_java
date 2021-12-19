package com.wuga.controller;

import com.wuga.dto.Account;
import com.wuga.view.AccountView;

public class AccountController {
	
	public AccountController(Account account) {
		accountMenu(account);
	}
	
	private AccountView av = AccountView.getInstance();
	
	private void accountMenu(Account account) { // 은행업무
		
		boolean run = true;
		
		while(run) {
			int selectMenu = av.accountMenu(account.getUser());
			
			switch(selectMenu) {
			case 1: // 잔액조회
				av.viewAmout(account);
				break;
			case 2: // 예금입금
				int depositMoney = av.deposit();
				account.deposit(depositMoney);
				break;
			case 3: // 예금출금
				int withdrawMoney = av.withdraw();
				checkMoney(account,withdrawMoney);
				break;
			case 4: // 돌아가기
				String selectExit = av.exit();
				run = exit(selectExit);
				break;
			default:
				av.err();
			}
		}
	}

	private void checkMoney(Account account, int withdrawMoney) {
		
		if(account.getAmount()<withdrawMoney) {
			av.withdrawErr(account.getAmount()-withdrawMoney);
		}else {
			account.withdraw(withdrawMoney);
		}
	}

	private boolean exit(String selectExit) {
		if(selectExit.equals("y")) {
			return false;
		}else if(selectExit.equals("n")) {
			return true;
		}else {
			av.err();
			return true;
		}
	}
}
