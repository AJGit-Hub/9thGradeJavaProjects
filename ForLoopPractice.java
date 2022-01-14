//	Aayush Jain
//	1/7/2020
//	For Loop Practice Problems

import java.io.*;
import java.util.*;

public class ForLoopPractice
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num1 = kbr.nextInt();
		System.out.print("Please enter another number: ");
		int num2 = kbr.nextInt();
		int gcf = 0;

		for(int x = 1; x <= num1 && x <= num2; x++)
		{
			if (num1 % x == 0 && num2 % x == 0)
			gcf = x;
		}
		System.out.println("The greatest common factor is: " +gcf);

	}
}