package com.kiragu.models;

import java.util.Date;

public class Loan {
	
	int id;
	int customerId;
	double amount;
	Date dueDate;
	double interest;
	
	public Loan() {}
	
	public Loan(int id, int customerId, Date dueDate, double interest) {
		this.id = id;
		this.customerId = customerId;
		this.dueDate = dueDate;
		this.interest = interest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
}
