/*import java.util.Scanner;

public class Box {
	private int len,brd,ht,vol;
	/*public Box()
	 *{
	 *System.out.println("Default Constructor Called");
	 */
	/*
	public Box()
	{
		len = 1;
		brd = 1;
		ht = 1;
	}
	
	public Box(int l,int b,int h)
	{
		len = 1;
		brd = b;
		ht = h;
	}
	public void volume()
	{
		vol = len*brd*ht;
		System.out.println("Volume of Box for Length:"+len+" "+" "+"Breadth:"+brd+"Height:"+ht);
	}
	
	public static void main(String[] args) {
		Box b = new Box();
		b.volume();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length ,breadth and height = " );
		int l = s.nextInt();
		int br = s.nextInt();
		int h = s.nextInt();
		Box bl = new Box(l,br,h);
		bl.volume();

}
}
*/



import java.util.Scanner;

public class Box {
    private int len, brd, ht, vol;
    
    // Default constructor
    public Box() {
        len = 1;
        brd = 1;
        ht = 1;
    }
    
    // Constructor with parameters
    public Box(int l, int b, int h) {
        len = l;
        brd = b;
        ht = h;
    }
    
    // Method to calculate volume
    public void volume() {
        vol = len * brd * ht;
        System.out.println("Volume of Box for Length: " + len + ", Breadth: " + brd + ", Height: " + ht + " is " + vol);
    }
    
    public static void main(String[] args) {
        // Create a default box and calculate its volume
        Box b = new Box();
        b.volume();
        
        // Prompt user to enter length, breadth, and height
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length, Breadth, and Height: ");
        int l = s.nextInt();
        int br = s.nextInt();
        int h = s.nextInt();
        
        // Create a box with user-provided dimensions and calculate its volume
        Box bl = new Box(l, br, h);
        bl.volume();

        // Close the scanner
        s.close();
    }
}
