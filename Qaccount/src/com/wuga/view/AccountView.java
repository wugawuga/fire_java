package com.wuga.view;

import com.wuga.dto.Account;
import com.wuga.main.Main;

public class AccountView {

	// 싱글톤
	private AccountView() {}
	private static AccountView mv = new AccountView();
	public static AccountView getInstance() {
		return mv;
	}
	public int accountMenu(String name) {
		System.out.println(name+"님 환영해요");
		System.out.println("업무를 위한 기능을 선택해요");
		System.out.println("1. 잔액조회");
		System.out.println("2. 예금입금");
		System.out.println("3. 예금출금");
		System.out.println("4. 주 메뉴로 돌아가요");
		System.out.print(">> ");
		return Integer.parseInt(Main.sc.nextLine());
	}
	public void err() {
		System.out.println("잘못 입력했어요. \n 다시 확인해 주세요");
	}
	public String exit() {
		System.out.println("주 메뉴로 돌아가시겠어요?(y/n)");
		System.out.print("(주메뉴로 돌아가면 다시 계좌로 접속해야 해요)");
		String selectExit = Main.sc.nextLine();
		return selectExit;
	}
	public void viewAmout(Account account) {
		System.out.println(account.getUser()+"님의 계좌에 남은 현재 잔액이에요");
		System.out.println("잔고 : "+account.getAmount());
	}
	public int deposit() {
		System.out.println("입금할 액수를 입력해요");
		
		return Integer.parseInt(Main.sc.nextLine());
	}
	public int withdraw() {
		System.out.println("출금할 액수를 입력해요");
		
		return Integer.parseInt(Main.sc.nextLine());
	}
	public void withdrawErr(int money) {
		System.out.println("출금할 "+money+"원 만큼 부족해요");
	}
}
