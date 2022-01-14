import java.awt.*;
import javax.swing.*;


class MainPanel extends JPanel {

	public void paintComponent(Graphics g)
		{



	    }


}









public class graphicTemplate extends JFrame{

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