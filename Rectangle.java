import java.util.*;

public class Rectangle{
	public static double perimeter(double len, double width)
	{
            double ans=	2*(len +width);
			double roundedValue = Math.round(ans * 100.0) / 100.0;
			return roundedValue;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle : ");
		double p= sc.nextFloat();
		System.out.println("Enter width of Rectangle : ");
		double r= sc.nextFloat();

		System.out.println("Perimeter of rectangle is : "+ perimeter(p,r));
	}
}