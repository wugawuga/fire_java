package com.wuga.dao;

import com.wuga.dto.Account;

public class AccountDAO { // 데이터 저장용 공간
	
	private AccountDAO() {}
	private static AccountDAO accDAO = new AccountDAO();
	public static AccountDAO getInstance() {
		return accDAO;
	}
	//----------------------------------------
	
	Account[] accounts = new Account[100]; // 초기값은 다 null
	
	public void insertAccount(Account acc) { // 입력받은 계좌 정보를 DB에 저장
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]==null) {
				accounts[i]=acc;
				break;
			}
		}
		// 계좌번호 중복 체크
		// 100칸이 부족할 경우
	}
	
	public Account selectAccountNumber(String accountNum) { // 계좌번호로 계좌 조회에서 반환
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]!=null) {
				if(accounts[i].getAccountNumber().equals(accountNum)) {
				return accounts[i];
				}
			}
		}
		return null;
	}

}
