/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.functions;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author RuwanM
 */
public class StringValidateDocumentFilter extends DocumentFilter {

    @Override
    public void replace(FilterBypass filterBypass, int strat, int end, String string, AttributeSet attributeSet) throws BadLocationException {
        for (int n = string.length(); n > 0; n--) {
            char charactor = string.charAt(n - 1);
            System.out.println(charactor);
            if (Character.isAlphabetic(charactor) || 
                    Character.isDigit(charactor) || 
                    charactor == ' ' || 
                    charactor == '-' ||
                    charactor == '\'' ||
                    charactor == '"') {
                super.replace(filterBypass, strat, end, String.valueOf(charactor), attributeSet);
            } else {
                System.out.println("Not allowed");
            }
        }
    }

    @Override
    public void remove(FilterBypass filterBypass, int start, int end) throws BadLocationException {
        super.remove(filterBypass, start, end);
    }

    @Override
    public void insertString(FilterBypass filterBypass, int location, String string, AttributeSet attributeSet) throws BadLocationException {
        super.insertString(filterBypass, location, string, attributeSet);
    }
}
