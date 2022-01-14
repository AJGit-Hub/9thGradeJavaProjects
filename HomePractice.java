import java.awt.*;
import javax.swing.*;

public class HomePractice
{
	public static void main(String args[])
	{
		String name = JOptionPane.showInputDialog("Enter your name: ");
		for (int x=name.substring(-1,-2).length();x<=name.length();x=x-1)
		{
			System.out.println(name.substring(x));
		}
	}
}