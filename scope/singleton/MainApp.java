/**
 * 
 */
package com.bridgelabz.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose: Programming example for singleton scope 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/scope/singleton/Bean.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      objA.setMessage("I'm object A");
      objA.getMessage();
      
     System.out.println("k"+objA.hashCode());
      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objA.setMessage("I'm object B");
      objB.getMessage();
      
      System.out.println("k"+objB.hashCode());

   }
}