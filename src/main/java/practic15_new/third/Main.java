package practic15_new.third;

import practic15_new.second.EmployeeController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        var t = new EmployeeGUIView();
        t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}
