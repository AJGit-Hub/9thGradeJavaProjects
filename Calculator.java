import java.io.*;
import java.util.*;

public class Calculator
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double number1 = kbr.nextDouble();
		System.out.print("Please enter another number: ");
		double number2 = kbr.nextDouble();
		System.out.println((int)number1 + " + " + (int)number2 + " = " + (number1 + number2));
		System.out.println((int)number1 + " - " + (int)number2 + " = " + (number1 - number2));
		System.out.println((int)number1 + " * " + (int)number2 + " = " + (number1 * number2));
		System.out.println((int)number1 + " / " + (int)number2 + " = " + (number1 * number2));
		System.out.println((int)number1 + " % " + (int)number2 + " = " + (number1 % number2));

	}
}