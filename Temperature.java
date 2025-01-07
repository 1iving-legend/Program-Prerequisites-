import java.util.*;

public class Temperature{
	public static double CtoF(double Celsius)
	{
            return 	(Celsius * 9/5) + 32;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius : ");
		double Celsius= sc.nextFloat();
		System.out.println("Temperature in Fahrenheit : "+ CtoF(Celsius));
	}
}