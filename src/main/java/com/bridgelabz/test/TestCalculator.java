/**
 * 
 */
package com.bridgelabz.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.junit.Calculator;

/**
 * Created By:Medini P.D
 * Date:- 03/07/2018
 * Purpose:
 */
public class TestCalculator {
 Calculator c=new Calculator();
 @Test
 public void testAdd()
 {
	assertEquals(5, c.add(2, 3));
 }
}
