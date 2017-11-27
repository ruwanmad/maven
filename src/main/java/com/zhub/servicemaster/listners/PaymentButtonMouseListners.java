/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.listners;

import com.zhub.servicemaster.data.SystemData;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author RuwanM
 */
public class PaymentButtonMouseListners implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object object = e.getSource();
        if (object instanceof JButton) {
            JButton button = (JButton) object;
            if (button.isEnabled()) {
                button.setBackground(SystemData.MOUSE_ENTER_COLOR);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object object = e.getSource();
        if (object instanceof JButton) {
            JButton button = (JButton) object;
            if (button.isEnabled()) {
                button.setBackground(SystemData.MOUSE_EXIT_COLOR);
            }
        }
    }

}
