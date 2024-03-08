
public class MutiplicationT {
    public static void main(String[] args) {
        int s = 100; 
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

