/**
 * Created by safomichev on 29.05.2017.
 */
import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.util.Arrays;

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

          // Create LayoutManager
          FlowLayout flowLayout = new FlowLayout(FlowLayout.LEADING);

          // Set Gaps
          flowLayout.setHgap(50);
          flowLayout.setVgap(50);

          // Set LayoutManager
          //contentPain.setLayout(new FlowLayout());
          contentPain.setLayout(flowLayout);

          // Add Buttons to contentPain
          contentPain.add(exitButton);
          contentPain.add(helpButton);

          // Set the default behavior te exit application
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          // Set the default bounds
          //frame.setBounds(20,20,150,150);
          //frame.setLocation(50,50);
          frame.setBounds(50, 50, 400, 400);

          //Set acceptable size for JFrame and Buttons
          frame.pack();

          // Display the frame
          frame.setVisible(true);

          // Get components on Container - contentPain
          Component[] components = contentPain.getComponents();
          // Print out count of componentson contentPain
          System.out.println("The contentPain consists of: " + components.length + " components");

      }



}
