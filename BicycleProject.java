public class BicycleProject
{
	public static void main(String args[])
	{
		Bicycle bike = new Bicycle("blue");
		bike.setSpeed(10);
		System.out.println("Color: " + bike.color);
		System.out.println("Speed: " + bike.speed);
		System.out.println("Miles travelled: " + bike.travel((double)3/60));
		System.out.println("Location: " + bike.location);

		bike.increaseSpeed(5);
		System.out.println("Speed: "+bike.speed);
		System.out.println("Miles traveled: " +bike.travel((double)3/60));
		System.out.println("Location: "+bike.location);

	}
}

class Bicycle
{
	public String color;
	public double location;
	public double speed;

	public Bicycle(String color)
	{
		this.color = color;
		location = 0;
		speed = 0;
	}
	public void setSpeed(double newSpeed)
	{
		speed = newSpeed;
	}
	public void increaseSpeed(double deltaSpeed)
	{
		speed += deltaSpeed;
	}
	public double travel(double hours)
	{
		double numOfMiles = speed * hours;
		location += numOfMiles;
		return numOfMiles;
	}
}