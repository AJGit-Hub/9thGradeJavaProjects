import java.io.*;
import java.util.*;

public class RomanNumeralsProject
{
	public static void main(String args[])
	{
		Scanner kbr = new Scanner(System.in);

		System.out.println("Enter a Roman Numeral");
		String input1 = kbr.next();
		Roman converted1 = new Roman(input1);

		System.out.println("Enter a Roman Numeral");
		String input2 = kbr.next();
		Roman converted2 = new Roman(input2);

		System.out.println("Enter a Roman Numeral");
		String input3 = kbr.next();
		Roman converted3 = new Roman(input3);


		System.out.print(converted1.romValue() + "\t" + converted1.decValue());
		System.out.println();
		System.out.print(converted2.romValue() + "\t" + converted2.decValue());
		System.out.println();
		System.out.print(converted3.romValue() + "\t" + converted3.decValue());
		System.out.println();
	}
}

class Roman
{
	String RomanInput;
	int convertedInput;

	public Roman(String RomanInput)
	{
		this.RomanInput = RomanInput;
		this.convertedInput = convertedInput;
		RomanInput = RomanInput + " ";

		int x = 0;
		while(x<RomanInput.length())
		{
			switch(RomanInput.charAt(x))
			{
				case 'M':
				{
				convertedInput += 1000;
				x++;
				continue;
				}

				case 'D':
				{
				convertedInput += 500;
				x++;
				continue;
				}

				case 'L':
				{
				convertedInput += 50;
				x++;
				continue;
				}

				case 'V':
				{
				convertedInput += 5;
				x++;
				continue;
				}

				case 'C':
				{
					if(RomanInput.charAt(x+1) == 'M'){
						convertedInput += 900;
						x+= 2;
					}
					else{
						convertedInput += 100;
						x++;
					}
				continue;
				}

				case 'X':
				{
					if(RomanInput.charAt(x+1) == 'L'){
						convertedInput += 40;
						x+= 2;
					}
					else{
						convertedInput += 10;
						x++;
					}
				continue;
				}

				case 'I':
				{
					if(RomanInput.charAt(x+1) == 'V'){
						convertedInput += 4;
						x+= 2;
					}
					else if(RomanInput.charAt(x+1) == 'X'){
						convertedInput += 9;
						x+= 2;
					}
					else{
						convertedInput += 1;
						x++;
					}
				continue;
				}
				default:
					x++;

			}


		}



	}
	public int decValue()
	{
		return convertedInput;
	}
	public String romValue()
	{
		return RomanInput;
	}

}