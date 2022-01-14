import java.awt.*;
import javax.swing.*;


class MainPanel extends JPanel {

	public void paintComponent(Graphics g)
		{
			g.setColor(Color.GRAY);
			g.fillRect(400,200,100,200);
			g.fillOval(410,120,80,80);
			g.setColor(Color.BLACK);
			g.fillOval(425,140,15,15);
			g.fillOval(455,140,15,15);
			g.setColor(Color.GRAY);
			g.fillRect(400,400,45,150);
			g.fillRect(455,400,45,150);
			g.fillRect(345,550,100,45);
			g.fillRect(455,550,100,45);
			g.fillArc(440, 199, 120, 95, 0, 90);
			g.fillArc(340, 199, 120, 95, 90, 90);
			g.fillRect(340,245,40,150);
			g.fillRect(520,245,40,150);

		}




}









public class RobotAssignment extends JFrame{

  public static void main(String[] args) {
      //This is a necessary in order to create the frame window
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              GraphicsMain();
          }
      });
  }

  public static void GraphicsMain() {

    //Sets up the frame
    JFrame frame = new JFrame("Graphics");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new BorderLayout());

    //Display the window.
    frame.pack();

    //Adds the graphics panel and sets the size
    frame.setSize(new Dimension(800,600));
    frame.getContentPane().add(new MainPanel(), BorderLayout.CENTER);
    frame.setVisible(true);
  }
}