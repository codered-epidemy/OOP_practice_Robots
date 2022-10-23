package gui;

import javax.swing.*;
import java.awt.event.ActionListener;


public class Menu {
    private JMenu newMenu;

    public Menu(String nameOfMenu, String accessDescription, Integer menuKeyEvent){
        newMenu = new JMenu(nameOfMenu);
        newMenu.setMnemonic(menuKeyEvent);
        newMenu.getAccessibleContext().setAccessibleDescription(accessDescription);
    }

    public void createMenuItem(String menuItemText, ActionListener actionListener, Integer itemKeyEvent) {
        JMenuItem menuItem = new JMenuItem(menuItemText, itemKeyEvent);
        menuItem.addActionListener(actionListener);
        newMenu.add(menuItem);
    }

    public JMenu getMenu() {
        return newMenu;
    }
}
