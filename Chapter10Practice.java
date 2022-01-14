import java.io.*;
import java.util.*;

public class Chapter10Practice
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String num = kbr.nextLine();

		int count = 0;

		switch(num.toUpperCase())
		{
			case "a": count++;
					break;
			case "A": count+=2;
					break;
			case "B: count+=3;
					break;
			case "C count+=4;
					break;
			case "D: count+=5;
					break;
			default: count+= 100;
		}
		System.out.println(count);
	}
}