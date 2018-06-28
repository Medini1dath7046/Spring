/**
 * 
 */
package com.bridgelabz.annotationsAutoWired;

/**
 * Created By:Medini P.D
 * Date:- 27/06/2018
 * Purpose:
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/annotationsAutoWired/Bean.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}