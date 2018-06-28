/**
 * 
 */
package com.bridgelabz.settersDI;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose: Program to demonstrate the implementation of setters dependency injection.
 */

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.*;

public class Main {
	
	public static void main(String[] args) {

		Resource r = new ClassPathResource("com/bridgelabz/settersDI/config.xml");

		BeanFactory factory = new XmlBeanFactory(r);

		Book b = (Book) factory.getBean("book11");

		b.display();
	}
}