import java.io.*;
import java.util.*;

public class ResistorProject
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.print("What is your first color: ");
		String color1 = kbr.nextLine();
		System.out.print("What is your second color: ");
		String color2 = kbr.nextLine();
		System.out.print("What is your third color: ");
		String color3 = kbr.nextLine();
		System.out.print("What is your fourth color: ");
		String color4 = kbr.nextLine();

		//Color 1
		int band1 = 30;
		if (color1.equals("black"))
		{
			band1 = 0;
		}
		else if (color1.equals("brown"))
		{
			band1 = 1;
		}
		else if(color1.equals("red"))
		{
			band1 = 2;
		}
		else if(color1.equals("orange"))
		{
			band1 = 3;
		}
		else if(color1.equals("yellow"))
		{
			band1 = 4;
		}
		else if(color1.equals("green"))
		{
			band1 = 5;
		}
		else if(color1.equals("blue"))
		{
			band1 = 6;
		}
		else if(color1.equals("violet"))
		{
			band1 = 7;
		}
		else if(color1.equals("grey"))
		{
			band1 = 8;
		}
		else if(color1.equals("white"))
		{
			band1 = 9;
		}
		else
		{
			System.out.println("Please enter a valid color");
		}
		//color2

		int band2 = (28);
		if (color2.equals("black"))
		{
			band2 = 0;
		}
		else if (color2.equals("brown"))
		{
			band2 = 1;
		}
		else if (color2.equals("red"))
		{
			band2 = 2;
		}
		else if (color2.equals("orange"))
		{
			band2 = 3;
		}
		else if (color2.equals("yellow"))
		{
			band2 = 4;
		}
		else if (color2.equals("green"))
		{
			band2 = 5;
		}
		else if (color2.equals("blue"))
		{
			band2 = 6;
		}
		else if (color2.equals("violet"))
		{
			band2 = 7;
		}
		else if (color2.equals("gray"))
		{
			band2 = 8;
		}
		else if (color2.equals("white"))
		{
			band2 = 9;
		}
		else
		{
			System.out.println("Please enter a valid color");
		}
		//color 3
		double band3 = 35.4;

		if (color3.equals("black"))
		{
			band3 = 1;
		}
		else if (color3.equals("brown"))
		{
			band3 = 10;
		}
		else if (color3.equals("red"))
		{
			band3 = 100;
		}
		else if (color3.equals("orange"))
		{
			band3 = 1000;
		}
		else if (color3.equals("yellow"))
		{
			band3 = 10000;
		}
		else if (color3.equals("green"))
		{
			band3 = 100000;
		}
		else if (color3.equals("blue"))
		{
			band3 = 1000000;
		}
		else if (color3.equals("violet"))
		{
			band3 = 10000000;
		}
		else if (color3.equals("gray"))
		{
			band3 = 100000000;
		}
		else if (color3.equals("white"))
		{
			band3 = 1000000000;
		}
		else if (color3.equals("gold"))
		{
			band3 = 0.1;
		}
		else if (color3.equals("silver"))
		{
			band3 = 0.01;
		}
		else
		{
			System.out.println("Please enter a valid color");
		}
		//colormath
		String b1 = Integer.toString(band1);
		String b2 = Integer.toString(band2);
		String band12 = (b1 + b2);
		int band12final = Integer.parseInt(band12);
		double band13 = band12final * band3;

		//band 4
		double band4 = 0.5;;
		if (color4.equals("brown"))
		{
			band4 = 1;
		}
		else if (color4.equals("red"))
		{
			band4 = 2;
		}
		else if (color4.equals("green"))
		{
			band4 = 0.5;
		}
		else if (color4.equals("blue"))
		{
			band4 = 0.25;
		}
		else if (color4.equals("violet"))
		{
			band4 = 0.10;
		}
		else if (color4.equals("gray"))
		{
			band4 = 0.05;
		}
		else if (color4.equals("gold"))
		{
			band4 = 5;
		}
		else if (color4.equals("silver"))
		{
			band4 = 10;
		}
		else if (color4.equals("none"))
		{
			band4 = 20;
		}
		else
		{
			System.out.println("Please enter a valid color");
		}
		System.out.println("The resistance of your resistor is: " + band13 + " ohms with a tolerance of: +-" + band4 + "%");
	}
}