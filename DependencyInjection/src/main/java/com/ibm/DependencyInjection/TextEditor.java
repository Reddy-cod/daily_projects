package com.ibm.DependencyInjection;

public class TextEditor {
  private SpellChecker spellChecker;
   public TextEditor(SpellChecker spellChecker) {
	   System.out.println("Inside TextEditor");
	   this.spellChecker=spellChecker;
   }
   public void spellCheck() {
	   spellChecker.checkSpelling();
   }
}
