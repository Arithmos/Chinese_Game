package chinesegame;

import java.awt.Color;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * File Name: ChineseGame.java
 *   Created: Oct 21, 2015
 *    Author: 
 */


public class ChineseGame extends JPanel implements ActionListener
{
  // Declare instance variables here...
  ChineseForm cf;

  
  // Constructor
  public ChineseGame(int w, int h, JFrame f)
  {
    super.setOpaque(true);
    super.setPreferredSize(new Dimension(w, h));
    super.setBackground(new Color(225, 225, 225));
    
    ChineseForm cf = new ChineseForm();
    super.add(cf);
  }
  
  // Perform any custom painting (if necessary) in this method
  @Override  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    
  }
  
  // Process GUI input in this method
  @Override  
  public void actionPerformed(ActionEvent e)
  {
    
    
    super.repaint();
  }
  
  //<editor-fold defaultstate="collapsed" desc="--This method will launch your application--">
  public static void main(String[] args)
  {
    JFrame.setDefaultLookAndFeelDecorated(false);
    JFrame fr = new JFrame("Application: Chinese Game");
    fr.setBackground(Color.decode("#E0E0E0"));
    fr.setContentPane(new ChineseGame(980, 580, fr));
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setLocation(10, 10);
    fr.setResizable(false);
    fr.pack();
    fr.setVisible(true);  
  }
  //</editor-fold>  
}
