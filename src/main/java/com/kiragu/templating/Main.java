/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiragu.templating;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import com.kiragu.models.Customer;
import com.kiragu.models.Loan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 *
 * @author john.kiragu
 */
public class Main {
    
    public static void main(String[] args) {
    	
    Customer customer = new Customer(2,"John","2543","1322",4);
    double total = 0;
    for (int i = 0; i < 1000; i++) {
    	long startTime = System.nanoTime();
    	expression1(customer);
    	long endTime = System.nanoTime();
    	total +=  (endTime - startTime) / 1000000;
    }
    
    System.out.println("Express 1 takes an average of " + (total / 1000));
    
    
    customer = new Customer(3,"Vincent","432432","44444",3);
    Calendar c=new GregorianCalendar();
    c.add(Calendar.DATE, 31);
    Date futureDate=c.getTime();
    Loan loan = new Loan(1, customer, 999, futureDate, 14.1);
    
    total = 0;
    for (int i = 0; i < 1; i++) {
    	long startTime = System.nanoTime();
        expression2(loan);
    	long endTime = System.nanoTime();
    	total +=  (endTime - startTime) / 1000000;
    }
    
    
    System.out.println("Express 2 takes an average of " + (total / 1000));
     
	 // Case 2 for Expression 3
	 loan = new Loan(1, customer, 2000, new Date(), 3);
	 customer = new Customer(4,"John","254722123456","44444",3);
	 loan.setCustomer(customer);
	 
	 
	 total = 0;
	    for (int i = 0; i < 1; i++) {
	    	long startTime = System.nanoTime();
	        // Case 1 for Expression 2
	    	expression2(loan);
	    	long endTime = System.nanoTime();
	    	total +=  (endTime - startTime) / 1000000;
	    }
	    
	    
	    System.out.println("Express 2 Case 2 takes an average of " + (total / 1000));
    }
    
    public static void expression1(Customer customer){
        long startTime = System.nanoTime();
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("riskBand==4");
        EvaluationContext context = new StandardEvaluationContext(customer);
        boolean result = exp.getValue(context, Boolean.class);
        
        if (result){
//            System.out.println("expression1 Journey A");
        }else{
//            System.out.println("expression1 Journey B");
        }  
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;
//        System.out.println("Expresssion one executed in..." +duration +"ms");
    }
    
    public static void expression2(Loan loan){
    	long startTime = System.nanoTime();
        ExpressionParser parser = new SpelExpressionParser();
        
        Calendar c=new GregorianCalendar();
        c.add(Calendar.DATE, 30);
        Date day30=c.getTime();
        
        Expression exp1 = parser.parseExpression(
        		"interest > 5 && "
        		+ "dueDate.getTime() > 1" // fix
        		+ "&& amount < 1000");
        
        Expression exp2 = parser.parseExpression(
        		"customer.name.equals(\"John\") && "
        		+ "customer.msisdn.equals(\"254722123456\")");
        
        EvaluationContext context = new StandardEvaluationContext(loan);

        boolean result = exp1.getValue(context, Boolean.class);
        
//        String params = "Amount " + loan.getAmount() + " Due Date: " + loan.getDueDate() + 
//        		" Interest: " + loan.getInterest() + " Name: " + loan.getCustomer().getName() +
//        		" MSISDN " + loan.getCustomer().getMsisdn();
        
        if (result){
//            System.out.println("expression2 Journey B - " + params);
        }else if (exp2.getValue(context, Boolean.class)){
        	
//            System.out.println("expression2 Journey A - " + params);
        } else {
//        	System.out.println("expression2 Journey B - " + params);
        }
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime)/1000000;
//        System.out.println("Expresssion two executed in... " +duration +" ms");
    }
     
    
}
