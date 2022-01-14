public class GasMileageProject
{
	public static void main(String args[])
	{
		Automobile myBMW = new Automobile(24);
		myBMW.fillUp(20);
		myBMW.takeTrip(100);
		double fuel_left = myBMW.reportFuel();
		System.out.println(fuel_left);
	}
}

class Automobile
{
	double mpg = 0;
	double gallons = 0;
	public Automobile(int mpg)
	{
		this.mpg = mpg;

	}
	public void fillUp(int fillAmt)
	{
		gallons += fillAmt;
	}
	public double reportFuel()
	{
		return gallons;
	}
	public void takeTrip(double milesDriven)
	{
		gallons-=milesDriven/mpg;
	}

}