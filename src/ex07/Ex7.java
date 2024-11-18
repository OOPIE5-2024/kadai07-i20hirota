package ex07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Ex7 {

  private JFrame frame;
  private DiskPanel colorPanel;
  private CurrentColor crrntBckColor = new CurrentColor();
  private CurrentColor crrntForColor = new CurrentColor();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex7 window = new Ex7();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex7() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel btnPanelNorth = new JPanel();
    frame.getContentPane().add(btnPanelNorth, BorderLayout.NORTH);
    
    //二つのパネルをおくパネル
    JPanel btnPanelSouth = new JPanel();
    frame.getContentPane().add(btnPanelSouth, BorderLayout.SOUTH);
    btnPanelSouth.setLayout(new GridLayout(2, 1, 0, 0));
    
    //丸の色を管理するボタンをおくパネル
    JPanel btnPanelForColor = new JPanel();
    btnPanelSouth.add(btnPanelForColor);
    
    //丸の大きさを変えるボタンをおくパネル
    JPanel btnPanelResize = new JPanel();
    btnPanelSouth.add(btnPanelResize);
    
    JButton fRed = new JButton("fRed");
    fRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeRed();
        colorPanel.setForeground(c);
      }
    });
    btnPanelForColor.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    btnPanelForColor.add(fRed);
    
    JButton fGreen = new JButton("fGreen");
    fGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeGreen();
        colorPanel.setForeground(c);
      }
    });
    btnPanelForColor.add(fGreen);
    
    JButton fBlue = new JButton("fBlue");
    fBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeBlue();
        colorPanel.setForeground(c);
      }
    });
    btnPanelForColor.add(fBlue);
    
    int size_large = 150;
    int size_medium = 100;
    int size_small = 50;
    
    JButton Large = new JButton("Large");
    Large.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(size_large);
        colorPanel.repaint();
      }
    });
    btnPanelResize.add(Large);
    
    JButton Medium = new JButton("Medium");
    Medium.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(size_medium);
        colorPanel.repaint();
      }
    });
    btnPanelResize.add(Medium);
    
    JButton Small = new JButton("Small");
    Small.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(size_small);
        colorPanel.repaint();
      }
    });
    btnPanelResize.add(Small);
    
    JButton btnRed = new JButton("Red");
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeRed();
        colorPanel.setBackground(c);
      }
    });
    btnPanelNorth.add(btnRed);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeGreen();
        colorPanel.setBackground(c);
      }
    });
    btnPanelNorth.add(btnGreen);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeBlue();
        colorPanel.setBackground(c);
      }
    });
    btnPanelNorth.add(btnBlue);
    
    colorPanel = new DiskPanel();
    colorPanel.setBackground(Color.BLACK);
    frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
  }

}
