public class Chapter11Practice
{
	public static void main(String args[])
	{
		System.out.println("Polar Express");
		int j;
		for(j=9;j>=0;j--)
		{
			if (j%2==0)
				continue;
			System.out.println("Hello\t" + j);
		}
	}
}