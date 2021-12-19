package com.wuga.dto;

public class Account { // 계좌 정보를 저장
	
	private String user;
	private String accountNumber;
	private int amount;
	
	public Account(String user, String accountNumber, int amount) {
		
		this.user = user;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	// 입금
	public void deposit(int money) {
		this.amount += money;
	}

	public void withdraw(int money) {
		this.amount -= money;
	}
}
