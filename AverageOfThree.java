import java.util.*;

public class AverageOfThree{
	public static double Average(double a, double b, double c)
	{
            double ans=	(a+b+c)/3;
			double roundedValue = Math.round(ans * 100.0) / 100.0;
			return roundedValue;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double num1= sc.nextFloat();
		System.out.println("Enter secound number : ");
		double num2= sc.nextFloat();
		System.out.println("Enter Third number : ");
		double num3= sc.nextFloat();
		System.out.println("Average of three number is : "+Average(num1,num2,num3));
	}
}