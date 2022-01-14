import java.io.*;
import java.util.*;

public class whileLoopPractice
{
	public static void main(String args[]) throws IOException
	{
		Scanner filedat = new Scanner (new File("grades.dat"));
		double sum = 0;
		int counter = 0;

		while(filedat.hasNextLine())
		{
			sum = 0;
			counter = 0;

			String grades = filedat.nextLine();
			Scanner parseIt = new Scanner (grades);

			while(parseIt.hasNextLine())
			{
				sum += parseIt.nextDouble();
				counter++;
			}
		}
		System.out.println(sum/counter);
	}
}