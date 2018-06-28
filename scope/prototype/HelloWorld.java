/**
 * 
 */
package com.bridgelabz.scope.prototype;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
