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
public class UpperCaseDocumentFilter extends DocumentFilter {

    @Override
    public void insertString(FilterBypass filterBypass, int offset,
            String text, AttributeSet attributeSet) throws BadLocationException {
        filterBypass.insertString(offset, text.toUpperCase(), attributeSet);
    }

    @Override
    public void replace(FilterBypass filterBypass, int offset, int length,
            String text, AttributeSet attributeSet) throws BadLocationException {
        filterBypass.replace(offset, length, text.toUpperCase(), attributeSet);
    }
}
