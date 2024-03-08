
public class Addition {
	public void add(int a,int b)
	{
		System.out.println("Sum = "+(a+b));
	}
	
	public int add(int a,int b,int c)
	{
		return  (a+b+c);
	}
	
	public float add(float a,float b)
	{
		return (a+b);
	}
	public static void main(String[] args)  {
		Addition a = new Addition();
		a.add(5, 5);
		System.out.println("Addition ="+a.add(5,6,7));
		float s  = a.add(10.2f,56.8f );
		System.out.println("s = "+s);
	}
}
