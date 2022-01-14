import java.io.*;
import java.util.*;

public class TipPercent
{
	public static void main (String args[])
	{
		Scanner kbr = new Scanner(System.in);
		System.out.print("Enter your meal amount in dollars: ");
		double meal = kbr.nextDouble();
		System.out.print("Enter your desired tip amount(percent): ");
		int tipPer = kbr.nextInt();
		double tip_amount = tipPer/100;
		System.out.println(tip_amount*meal);
	}
}