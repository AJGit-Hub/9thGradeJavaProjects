import java.io.*;
import java.util.*;

public class VowelCounter
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = kbr.nextLine();
		String sentenceupper = sentence.toUpperCase();
		int sentencelength = sentenceupper.length();
		int numVowels = 0;

		for(int x = 0; x <= sentencelength; x++)
		{
			if (sentenceupper.charAt(x).equals("A"))
			{
				numVowels++;
			}
			else if (sentenceupper.charAt(x).equals("E"))
			{
				numVowels++;
			}
			else if (sentenceupper.charAt(x).equals("I"))
			{
				numVowels++;
			}
			else if (sentenceupper.charAt(x).equals("O"))
			{
				numVowels++;
			}
			else if (sentenceupper.charAt(x).equals("U"))
			{
				numVowels++;
			}
			else if (sentenceupper.charAt(x).equals("Y"))
			{
				numVowels++;
			}
		}
		System.out.println("The number of vowels is: " + numVowels);
	}
}