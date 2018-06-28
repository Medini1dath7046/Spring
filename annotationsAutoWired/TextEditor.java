package com.bridgelabz.annotationsAutoWired;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */

public class TextEditor {
   private SpellChecker spellChecker;
   private String name;
   
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker() {
      return spellChecker;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}