/**
 * 
 */
package com.bridgelabz.ConstructorDi;

/**
 * Created By:Medini P.D
 * Date:- 27/06/2018
 * Purpose: Program to demonstrate the constructor dependency injection.
 */
import org.springframework.beans.factory.BeanFactory;  

import org.springframework.beans.factory.xml.XmlBeanFactory;  

import org.springframework.core.io.*;  

public class Main {  

    public static void main(String[] args) {  
        Resource r=new ClassPathResource("com/bridgelabz/ConstructorDi/config.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Book b=(Book)factory.getBean("book");  
        b.display();  
    }  
}
