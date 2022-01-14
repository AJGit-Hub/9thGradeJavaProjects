import java.io.*;
import java.util.*;

public class wordCount
{
	public static void main(String args[]) throws IOException
	{
		Scanner fileReader = new Scanner (new File("Sentences.in"));
		int charCount = 0;

		while(fileReader.hasNextLine())
		{
			Scanner lineReader = new Scanner(fileReader.next());


			while(lineReader.hasNext())
			{
				charCount++;
			}


		}
		System.out.println(charCount);



	}
}