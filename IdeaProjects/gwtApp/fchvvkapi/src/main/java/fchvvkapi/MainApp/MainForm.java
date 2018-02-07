package fchvvkapi.MainApp;

import fchvvkapi.Helpers.TableFiller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainForm extends JFrame {
    /**
     * Верхняя панель на которой находится таблица
     */
    private JPanel topPanel;

    /**
     * Нижняя часть на которой находится форма добавления записи
     */
    private JPanel downPanel;

    /**
     * Основная панель которая содержит в себе 2 других панели
     */
    private JPanel mainPanel;
    private String[] columnsNames = {"LastName", "FirstName", "MidleName"};
    private String[][] values = new String[35][35];
    private JTable table = new JTable();

    public MainForm() {
        mainPanel = (JPanel) this.getContentPane();
        int row = 0;
        for(String s: TableFiller.getNames()) {
            values[row][0] = s.substring(0, Math.min(s.length(), 10));
            values[row][1] = "";
            values[row][2] = "";
            row++;
        }

        table = new JTable(values, columnsNames);
        GridLayout layout = new GridLayout(2, 0);
        mainPanel.setLayout(layout);
        topPanel = new JPanel();
        downPanel = new JPanel();
        mainPanel.add(topPanel);
        Border topBorder = BorderFactory.createLineBorder(Color.black);
        Border downBorder = BorderFactory.createLineBorder(Color.black);
        //topPanel.add(new JButton("btnOnTop"));

        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        //topPanel.add(table);
        topPanel.add(scrollPane);
        topPanel.setBorder(topBorder);
        downPanel.add(new JButton("btnOnDown"));
        downPanel.setBorder(downBorder);

        mainPanel.add(downPanel);
    }
}
