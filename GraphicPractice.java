import java.awt.*;
import javax.swing.*;


class MainPanel extends JPanel {

	public void paintComponent(Graphics g)
		{
			g.setColor(Color.BLUE);
			g.drawLine(50,50,300,50);

			g.setColor(new Color(138,86,72));
			g.fillRect(100,100,100,100);

			g.setColor(Color.red);
			g.fillOval(100,100,100,100);

			g.fillArc(300,300,200,200,90,90);

			g.setColor(Color.BLUE);
			int[] x={400,275,525};
			int[] y={100,225,225};

			g.fillPolygon(x,y,3);

		}




}









public class GraphicPractice extends JFrame{

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