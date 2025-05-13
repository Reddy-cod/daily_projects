package com.ibm.AutoWire;

public class TextEditor {
    private SpellChecker spellChecker;

    // Default constructor
    public TextEditor() {
        // You can either initialize the spellChecker here or let Spring inject it
    }

    // Setter for autowiring the SpellChecker
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    // Other methods...
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
