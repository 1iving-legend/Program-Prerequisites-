import java.util.*;

public class KilometersToMiles{
	public static double convert(double kilo)
	{
            return 	kilo * 0.621371;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in Kilometers : ");
		double k= sc.nextFloat();
		System.out.println("Distance in Miles "+ convert(k));
	}
}