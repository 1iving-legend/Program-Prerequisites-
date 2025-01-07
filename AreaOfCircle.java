import java.util.*;

public class AreaOfCircle{
	public static double area(double radii)
	{
            double ans=	Math.PI*radii*radii;
			double roundedValue = Math.round(ans * 10000.0) / 10000.0;
			return roundedValue;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious of Circle : ");
		double Radious= sc.nextFloat();
		System.out.println("Temperature in Fahrenheit : "+ area(Radious));
	}
}