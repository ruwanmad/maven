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
public class LimitDocumentFilter extends DocumentFilter {

    private final int limit;

    public LimitDocumentFilter(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Limit can't be less than zero");
        }
        this.limit = limit;
    }

    @Override
    public void replace(FilterBypass filterBypass, int offset, int length, String text, AttributeSet attributeSet) throws BadLocationException {
        int currentLength = filterBypass.getDocument().getLength();
        int overLimit = (currentLength + text.length()) - limit - length;
        if (overLimit > 0) {
            text = text.substring(0, text.length() - overLimit);
        } 
        
        if (text.length() > 0) {
            super.replace(filterBypass, offset, length, text, attributeSet);
        }
    }
}
