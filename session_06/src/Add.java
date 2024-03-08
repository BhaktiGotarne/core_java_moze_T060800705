

 public class Add {
	public int add(int...  a)
	{
		int count = a.length;
		System.out.println("Count = "+count);
		int sum = 0;
		for(int i:a)
		{
			sum+=i;
			
		}
		return sum;
	}

}
