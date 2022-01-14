public class WakelandField
{
	public static void main(String args[])
	{
		String str = "Wakeland Track and Field";
		String str3 = str.substring(0,9) + str.substring(str.length()-5);
		System.out.println(str3 + " has "  + str3.length() + " characters in it");

	}
}