import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers separated by spaces: ");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        
        
        int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
        
        System.out.println("Minimum of " + x + ", " + y + ", and " + z + " is: " + min);
    }
}
