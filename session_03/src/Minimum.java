import java.util.Scanner;

public class Minimum {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Enter any two numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		int min = (a<b)?a:b;
		System.out.println("Minimum of "+a+" and "+b+" = "+min);
	}

}
