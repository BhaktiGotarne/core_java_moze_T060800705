import java.util.Scanner;

public class Triangle {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Base = ");
		long b = s.nextLong();
		System.out.println("Enter height = ");
		long h = s.nextLong();
		
		float tri = 0.5f*b*h;
		System.out.println("Area of a Triangle = "+tri);
			
	}

}