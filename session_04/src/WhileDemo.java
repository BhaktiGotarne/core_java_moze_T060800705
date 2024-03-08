import java.util.Scanner;

public class WhileDemo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number = ");
		int no = s.nextInt();
		int fact = 1;
		int i =1;
		
		while(i<=no)
		{
			fact*=i;
			i++;
		}
		System.out.println("Factorial of "+no+" is "+fact);
	}

}
