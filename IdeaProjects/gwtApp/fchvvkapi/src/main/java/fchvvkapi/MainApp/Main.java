package fchvvkapi.MainApp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        mainForm.setTitle("TestPanel");
        mainForm.setSize(200, 200);
        mainForm.setLocation(200, 200);
        mainForm.pack();
        mainForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
