/**
 * Created by safomichev on 29.05.2017.
 */
import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FirstJavaClass extends JFrame{

      public static void main(String[] args) {
          // Create a frame
          JFrame frame = new JFrame("Simplest Swing");

          // Create exit Button
          JButton exitButton = new JButton("Exit");
          // Create help Button
          JButton helpButton = new JButton("Help");

          // Get Container contentPane. This is the main Pane
          Container contentPain = frame.getContentPane();

          // Add Buttons to contentPain
          contentPain.add(exitButton);
          contentPain.add(helpButton);

          // Set the default behavior te exit application
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          // Set the default bounds
          //frame.setBounds(20,20,150,150);
          frame.setLocation(50,50);

          //Set acceptable size for JFrame and Buttons
          frame.pack();

          // Display the frame
          frame.setVisible(true);


      }



}
