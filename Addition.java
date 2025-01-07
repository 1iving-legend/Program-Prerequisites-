import java.util.*;

public class Addition{
	public static int add(int a, int b)
	{
            return a+b;	
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1= sc.nextInt();
			System.out.println("Enter secound number : ");
		int num2= sc.nextInt();
		System.out.println("Sum of two number is : "+ add(num1,num2));
	}
}