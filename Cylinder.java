import java.util.*;

public class Cylinder{
	public static double volume(double radii, double height)
	{
            double ans=	Math.PI*radii*radii*height;
			double roundedValue = Math.round(ans * 10000.0) / 10000.0;
			return roundedValue;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious of Cylinder : ");
		double Radious= sc.nextFloat();
		System.out.println("Enter Height of Cylinder : ");
		double Height= sc.nextFloat();
		System.out.println("Volume of Cylinder : "+ volume(Radious,Height));
	}
}