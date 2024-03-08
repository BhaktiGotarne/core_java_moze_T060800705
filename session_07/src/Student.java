
public class Student {
	private int rollNo;
	private String name;
	private static int count;
	
	
	public Student(int rollNo, String name)  {
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}  
	
	
	public static int getCount ()
	{
		return count;
		
	}
	public String toString() {
		return "Student  [rollNo=" + rollNo  + " ," +" name=" + name + "]";
		
				
	}
	
	static
	{
		System.out.println("Static Block invocked--->");
		count = 60;
	}

	public static void main(String args[]) {
		System.out.println("In main method--->");
		Student s1 = new Student(1,"Rahul");
		System.out.println(s1);
		Student s2 = new Student(2,"Aishwarya");
		System.out.println(s2);
	}
}
