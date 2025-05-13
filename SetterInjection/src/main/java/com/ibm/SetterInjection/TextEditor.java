package com.ibm.SetterInjection;
public class TextEditor {
	  private SpellChecker spellChecker;
	   public TextEditor(SpellChecker spellChecker) {
		   System.out.println("Inside TextEditor");
		   this.spellChecker=spellChecker;
	   }
	   public TextEditor() {
		   
	   }
	   public void spellCheck() {
		   spellChecker.checkSpelling();
		   
	   }
	   public void setSpellChecker(SpellChecker spellChecker) {
		   this.spellChecker = spellChecker;
	   }
	   
	}
