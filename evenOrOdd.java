import java.io.*;
import java.util.*;

public class evenOrOdd
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = kbr.nextInt();
		if (number % 2 == 0)
		{
			System.out.println("The integer " + number + " is even");
		}
		else
		{
			System.out.println("The integer " + number + " is odd");
		}
	}
}