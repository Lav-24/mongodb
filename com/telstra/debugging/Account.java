package com.telstra.debugging;

public class Account {
	int id;
	String name;
	int balance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account()
	{
		super();
	}
	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	void deposit(int amount)
	{
		balance=balance+amount;
	}
	void withdraw(int amount)
	{
		balance=balance-amount;
	}
}
