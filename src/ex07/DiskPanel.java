package ex07;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DiskPanel extends JPanel {
  private int radius = 100;
  
  public int getRadius() {
    return radius;
  }
  
  public void setRadius(int r) {
    radius = r;
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    int w = this.getWidth();
    int h = this.getHeight();
    g.fillOval(w/2 - radius, h/2 - radius, radius*2, radius*2);
  }
}
