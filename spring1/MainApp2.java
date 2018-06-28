
package com.bridgelabz.spring1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
   @SuppressWarnings("resource")
public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/spring1/Bean.xml");

      HelloWorld2 obj = (HelloWorld2) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
   }
}