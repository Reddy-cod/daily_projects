package com.ibm.InnerBeans;

import com.ibm.InnerBeans.SpellChecker;


public class TextEditor {
    private SpellChecker spellChecker;

    // Setter method for property injection
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

