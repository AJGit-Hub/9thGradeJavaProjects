//Aayush Jain
//2/15/2021
//Basically Speaking 2 Java


public class BasicallySpeaking
{
	public static void main(String args[])	//Main method. Prints numbers from 65 to 90 in loop
	{
		int x = 0;
		for(x=65; x<=90; x++)
		{
			System.out.println(x+"\t"+reverseString(toBinaryString(x))+"\t"+reverseString(toOctalString(x))+"\t"+reverseString(toHexString(x))+"\t"+(char)x);
		}
	}
	static String toBinaryString(int x) // Prints number in Binary
	{
		String result = "";			//Builds string to return
		int numcreator;

		for(int q = x; q > 0; q = (int)q/2)		//for loop to iterate through each number in 65 to 90
		{
			numcreator = q%2;
			String binString = Integer.toString(numcreator);
			result = result + binString;	//Adds values to result
		}
		return result;		//Returns finished string
	}
	static String toOctalString(int x) //Same process for each method.
	{
		String result = "";
		int numcreator;

		for(int q = x; q > 0; q = (int)q/8)
		{
			numcreator = q%8;
			String octString = Integer.toString(numcreator);
			result = result + octString;
		}
		return result;
	}
	static String toHexString(int x)	//Converts to Hexadecimal
	{
		String result = "";
		int numcreator;

		for(int q = x; q > 0; q = (int)q/16)
		{
			numcreator = q%16;
			String hexString = Integer.toString(numcreator);
			switch(hexString)		//Converts numbers 10-15 to A-F using switch statement.
			{
				case "10": hexString = "a";
				break;
				case "11": hexString = "b";
				break;
				case "12": hexString = "c";
				break;
				case "13": hexString = "d";
				break;
				case "14": hexString = "e";
				break;
				case "15": hexString = "f";
				break;
			}
			result = result + hexString;	//Builds returning string
		}
		return result;		//Returns string
	}
	static String reverseString(String strval)		//Method used to reverse result
	{
		String returnval = "";
		for(int counter = strval.length()-1; counter >= 0; counter--)	//Iterates from the end going back building a new String
		{
			returnval = returnval + strval.charAt(counter);
		}
		return returnval;		//Returns reversed result.
	}
}