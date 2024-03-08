package session_09;

public class A extends Object {
	private int a;
	public String name = "mayuri";
	
	public A()
	{
		System.out.println("Default Constructor of A");
		
	}
	public A(String s)
	{
		System.out.println("Param of Constructor of A");
		
	}
	public void get()
	{
		System.out.println("In get() of A");
		
	}
	
	@Override
	public String toString()  {
		return "";
	}
}
