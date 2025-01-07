import java.util.*;

public class Power{
	public static double raised(double base, double pow)
	{
            double ans=	Math.pow(base,pow);
			double roundedValue = Math.round(ans * 1000.0) / 1000.0;
			return roundedValue;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base value : ");
		double b= sc.nextFloat();
		System.out.println("Enter pawer : ");
		double r= sc.nextFloat();

		System.out.println("Perimeter of rectangle is : "+ raised(b,r));
	}
}