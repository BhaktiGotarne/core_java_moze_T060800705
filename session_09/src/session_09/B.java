package session_09;

public class B extends A{
	
	public B()
	{
		//super();
		System.out.println("Default constructor of B");
	}
	
	public B(int a)
	{
		//super();
		super("abc");
		System.out.println("parameterized const of B");
		
	}
	@Override
	public void get()
	{
		System.out.println("In get of B");
		
	}
	public static void main(String args[]) {
		B b = new B(10);
		b.get();
		//System.out.println(b.a);
	}

}
