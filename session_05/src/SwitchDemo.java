import java.util.Scanner;

public class SwitchDemo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = 0;
		int a,b,c=0;
		char ch;
		do {
			System.out.println("Enter you choice : ");
			System.out.println("a.Addition\tb.Substraction\t" + "c.Multiplication\td.Division\te.EXit");
			ch = s.next().charAt(0);
			
			
			switch(ch)
			{
			case 'a':
				System.out.println("Enter any two numbers: ");
				a = s.nextInt();
				b = s.nextInt();
				c = a + b ;
				System.out.println(a+"+"+b+"="+c);
				break;
				
			case 'b':
				System.out.println("Enter any two numbers: ");
				a = s.nextInt();
				b = s.nextInt();
				if(a>b)
				{
				c = a - b ;
				}else
				{
				System.out.println(a+"-"+b+"="+c);
				}
				break;
				
			case 'c':
				System.out.println("Enter any two numbers: ");
				a = s.nextInt();
				b = s.nextInt();
				if(b==0)
				{
				System.out.println("Denominator should not be zero");
				}else  
				
			}
		}
	}

}