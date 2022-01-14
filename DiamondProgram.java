import java.io.*;
import java.util.*;


public class DiamondProgram
{
	public static void main(String args[])
	{
		/*Scanner kbr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kbr.nextInt();
		if(num%2 == 0)
		{
			num++;
		}
		int spaces = num - 1;
		for(int i = 1; i <= spaces; i++)
		{
			System.out.print(" ");

		}
		System.out.println("*");*/

		int rows, i, x, spaces = 1;
		Scanner kbr = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = kbr.nextInt();
        if(rows%2 == 0)
		{
			rows++;
		}
        spaces = rows - 1;
        for (x = 1; x <= rows; x++)
        {
            for (i = 1; i <= spaces; i++)
            {
                System.out.print(" ");
            }
            spaces--;
            for (i = 1; i <= 2 * x - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        spaces = 1;
        for (x = 1; x <= rows - 1; x++)
        {
            for (i = 1; i <= spaces; i++)
            {
                System.out.print(" ");
            }
            spaces++;
            for (i = 1; i <= 2 * (rows - x) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
	}
}