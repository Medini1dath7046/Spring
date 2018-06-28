/**
 * 
 */
package com.bridgelabz.spring1;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * 
 */


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   @SuppressWarnings("resource")
public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/spring/Config.xml");
      HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
      obj.getMessage();
   }
}
