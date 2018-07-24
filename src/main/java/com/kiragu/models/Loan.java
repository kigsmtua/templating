package com.kiragu.models;

import java.util.Date;

public class Loan {
	
	int id;
	double amount;
	Date dueDate;
	double interest;
	Customer customer;
	
	public Loan() {}
	
	public Loan(int id, Customer customer, double amount, Date dueDate, double interest) {
		this.id = id;
		this.customer = customer;
		this.dueDate = dueDate;
		this.interest = interest;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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
