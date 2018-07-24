/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiragu.templating;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

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
     System.out.println("The length returned is..." + length);
    }
    
    public static String expression1(Customer customer){
    }
    
    public static String expression2(Customer customer){
    
    }
    
    public static
    
    
}
