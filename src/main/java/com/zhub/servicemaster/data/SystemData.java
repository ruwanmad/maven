/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.data;

import java.awt.Color;
import java.text.SimpleDateFormat;

/**
 *
 * @author RuwanM
 */
public class SystemData {

    public static final String COMBO_DEFAULT = "--Select--";
    public static final Color MOUSE_ENTER_COLOR = new Color(50, 255, 50);
    public static final Color MOUSE_EXIT_COLOR = new Color(150, 255, 150);
    public static final Color BUTTON_BACKGROUND_COLOR = new Color(150, 255, 150);
    public static final Color BORDER_COLOR = new Color(50, 255, 50);
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
    public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final String NEW_RECORD_ADDED_MESSAGE = "New Record addedd";
    public static final String NEW_RECORD_ADDED_HEADING = "Added";
    public static final String RECORD_UPDATED_MESSAGE = "Record updated";
    public static final String RECORD_UPDATED_HEADING = "Updated";
}
