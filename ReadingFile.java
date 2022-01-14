import java.io.*;
import java.util.*;

public class ReadingFile
{
	public static void main(String args[]) throws IOException
	{
		Scanner kbr = new Scanner(new File("ReadingFileDoc.txt"));
		int index = -1;
		String test[] = new String[100];

		while (kbr.hasNextLine())
		{
			index++;
			test[index] = kbr.nextLine();
		}

		for(int j = 0; j < index; j++)
		{
			System.out.println(test[j]);
		}


	}

}