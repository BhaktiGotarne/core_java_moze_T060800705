import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter principal : ");
        int principal = s.nextInt();
        
        System.out.println("Enter annual interest rate(in %): ");
        int rate = s.nextInt();
        
        System.out.println("Enter time(in year) : ");
        int time = s.nextInt();
        
        int simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

