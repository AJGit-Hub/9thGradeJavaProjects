import java.io.*;
import java.util.*;

public class ResistorProjectSwitches
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

		switch(color1)
		{
		case "black":
			band1 = 0;
			break;
		case "brown":
			band1 = 1;
			break;
		case "red":
			band1 = 2;
			break;
		case "orange":
			band1 = 3;
			break;
		case "yellow":
			band1 = 4;
			break;
		case "green":
			band1 = 5;
			break;
		case "blue":
			band1 = 6;
			break;
		case "violet":
			band1 = 7;
			break;
		case "gray":
			band1 = 8;
			break;
		case "white":
			band1 = 9;
			break;
		default:
			System.out.println("Please enter a valid color");
		}
		//color2
		int band2 = (28);
		switch(color2)
		{
		case "black":
			band2 = 0;
			break;
		case "brown":
			band2 = 1;
			break;
		case "red":
			band2 = 2;
			break;
		case "orange":
			band2 = 3;
			break;
		case "yellow":
			band2 = 4;
			break;
		case "green":
			band2 = 5;
			break;
		case "blue":
			band2 = 6;
			break;
		case "violet":
			band2 = 7;
			break;
		case "gray":
			band2 = 8;
			break;
		case "white":
			band2 = 9;
			break;
		default:
			System.out.println("Please enter a valid color");
		}
		//color 3
		double band3 = 35.4;
		switch(color3)
		{
		case "black":
			band3 = 1;
			break;
		case "brown":
			band3 = 10;
			break;
		case "red":
			band3 = 100;
			break;
		case "orange":
			band3 = 1000;
			break;
		case "yellow":
			band3 = 10000;
			break;
		case "green":
			band3 = 100000;
			break;
		case "blue":
			band3 = 1000000;
			break;
		case "violet":
			band3 = 10000000;
			break;
		case "gray":
			band3 = 100000000;
			break;
		case "white":
			band3 = 1000000000;
			break;
		case "gold":
			band3 = 0.1;
			break;
		case "silver":
			band3 = 0.01;
			break;
		default:
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

		switch(color4)
		{
		case "brown":
			band4 = 1;
			break;
		case "red":
			band4 = 2;
			break;
		case "green":
			band4 = 0.5;
			break;
		case "blue":
			band4 = 0.25;
			break;
		case "violet":
			band4 = 0.10;
			break;
		case "gray":
			band4 = 0.05;
			break;
		case "gold":
			band4 = 5;
			break;
		case "silver":
			band4 = 10;
			break;
		case "none":
			band4 = 20;
		default:
			System.out.println("Please enter a valid color");
		}
		System.out.println("The resistance of your resistor is: " + band13 + " ohms with a tolerance of: +-" + band4 + "%");
	}
}