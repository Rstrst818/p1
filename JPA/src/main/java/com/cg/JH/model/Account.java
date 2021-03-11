package com.cg.JH.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name="acc_no")
	@Id
	private String accountnumber;
	private String bankName;
	private String branchName;
	private double balance;
	public Account() {
		//default
	}

	public Account(String accountnumber, String bankName, String branchName, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.bankName = bankName;
		this.branchName = branchName;
		this.balance = balance;
	}

	public String getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return String.format("Account [accountnumber=%s, bankName=%s, branchName=%s, balance=%s]", accountnumber,
				bankName, branchName, balance);
	}
	
}