import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Car extends Frame {
  Car() {
    addWindowListener(new FecharJanela());
  }
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g; // cast to Graphics2D
    /* desenho do carro */
    GeneralPath gp = new GeneralPath();
    gp.moveTo(60,120); //start here
    gp.lineTo(80,120);
    gp.quadTo(90,140,100,120);
    gp.lineTo(160,120);
    gp.quadTo(170,140,180,120);
    gp.lineTo(200,120);
    gp.curveTo(195,100,200,80,160,80);
    gp.lineTo(110,80);
    gp.lineTo(90,100);
    gp.lineTo(60,100);
    gp.lineTo(60,120); //going left (back to start)

    g2d.draw(gp); //or g2d.fill(gp)
    /* ---------- */
    //g2d.drawString("Hellow world", 30,50);
  }
  public static void main(String[] argv) {
    Car f = new Car();
    f.setTitle("texto");
    f.setSize(250, 80);
    f.setVisible(true);
  }
  public class FecharJanela extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }
}