/* Aayush Jain
 * Hangman Project
 *11/22/2020
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

class MainPanel extends JPanel
{
	//String[] wordChoices={"spring","aayush","iphone","brazil","change", "monkey"};
	String[] wordChoices={"spring"};

	public void paintComponent(Graphics g)
	{
		g.drawLine(100,100,100,500);
		g.drawLine(10,500,300,500);
		g.drawLine(100,100,200,100);
		g.drawLine(200,100,200,120);

		Random r = new Random();
        int randomNumber=r.nextInt(wordChoices.length);
        String randomWord = wordChoices[randomNumber];
		System.out.println(randomWord);
		String firstLetter = JOptionPane.showInputDialog("Enter the first letter: ");

        if (firstLetter.toLowerCase().equals(randomWord.substring(0,1))){
        	System.out.println("correct");
        	String secondLetter = JOptionPane.showInputDialog("Enter the second letter: ");
        	if (secondLetter.toLowerCase().equals(randomWord.substring(1,2))){
        		System.out.println("Correct");
        	}
        	else{
        		System.out.println("Hello");
        	}
        }
        else{
        	System.out.println("Wrong! Move on to next letter");
        	g.fillOval(150,110,100,100);
        	String secondLetter = JOptionPane.showInputDialog("Enter the second letter: ");
        }




        }
	}



public class Hangman extends JFrame{

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