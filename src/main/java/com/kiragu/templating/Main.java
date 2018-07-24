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
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 *
 * @author john.kiragu
 */
public class Main {
    
    public static void main(String[] args) {
     ExpressionParser parser = new SpelExpressionParser();
     Expression exp = parser.parseExpression("'Hello World'.bytes.length");
     int length = (Integer) exp.getValue();
//   The expressions can be used here
     Customer customer = new Customer(2,"John","2543","1322",4);
     expression1(customer);
     System.out.println("The length returned is..." + length);
    }
    
    public static void expression1(Customer customer){
     
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("riskBand==4");
        EvaluationContext context = new StandardEvaluationContext(customer);
        boolean result = exp.getValue(context, Boolean.class);
        
        if (result){
            System.out.println("Journey A");
        }else{
            System.out.println("Journey B");
        }
    }
    
    public static String expression2(Customer customer){
        return "jsjs";
    }
     
    
}
