package com.kiragu.models;

public class Customer {
	
	int id;
	String name;
	String msisdn;
	String accountNumber;
	int riskBand;
	
	public Customer() {}
	
	public Customer(int id, String name, String msisdn, String accountNumber, int riskBand) {
		this.id = id;
		this.name = name;
		this.msisdn = msisdn;
		this.accountNumber = accountNumber;
		this.riskBand = riskBand;
	}
	
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
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getRiskBand() {
		return riskBand;
	}
	public void setRiskBand(int riskBand) {
		this.riskBand = riskBand;
	}
}
