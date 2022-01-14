import java.io.*;
import java.util.*;

public class ForLoopPractice2
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);
		for(int x=9;x>=0;x--)
		{
			for(int y=0;y<=x;y++)

				System.out.print("$");


			System.out.println();
		}
	}
}