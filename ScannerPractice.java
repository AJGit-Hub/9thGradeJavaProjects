import java.io.*;
import java.util.*;

public class ScannerPractice
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);

		System.out.print("Enter your favorite number: ");

		int number = kbr.nextInt();

		kbr.nextLine();

		System.out.print("Enter your name: ");

		String name = kbr.nextLine();

		System.out.println(name + " " + number);
	}
}