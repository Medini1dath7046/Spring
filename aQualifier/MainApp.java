/**
 * 
 */
package com.bridgelabz.aQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:Programming example for qualifier annotation
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/aQualifier/beans.xml");

      Profile profile = (Profile) context.getBean("profile");
      profile.printAge();
   }
}