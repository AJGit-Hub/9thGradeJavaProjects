import java.io.*;
import java.util.*;

public class CircleTester
{
	public static void main(String[] args)
	{
		Circle cir = new Circle(30);
		Circle cir2 = new Circle(30);
		boolean isSame = false;

		System.out.println(cir.area());
		System.out.println(cir2.area());
		System.out.println(cir.circumfrence());
		System.out.println(cir2.circumfrence());
		System.out.println(cir.diameter());
		System.out.println(cir2.diameter());
		System.out.println(cir);
		System.out.println(cir2);
		System.out.println(isSame);

		if(cir.radius.equals(cir2.radius))
			isSame = true;

	}
}


class Circle
{
	double radius;

	public Circle(double radius)
	{
		this.radius = rad;
	}

	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double circumfrence()
	{
		return 2*Math.PI*radius;
	}
	public double diameter()
	{
		return radius * 2;
	}
	public String toString()
	{
		return "Whats Up Homie your radius is: " + radius;
	}
	public boolean equals(Circle cir)
	{
		return radius == cir.radius;
	}
}