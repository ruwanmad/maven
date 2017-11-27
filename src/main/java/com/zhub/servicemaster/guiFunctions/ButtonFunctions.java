/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.guiFunctions;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author RuwanM
 */
public class ButtonFunctions {

    public static void changeBackgroundColor(Object source, Color color) {
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            if (button.isEnabled()) {
                button.setBackground(color);
            }
        }
    }
}
