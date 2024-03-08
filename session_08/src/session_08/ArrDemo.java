package session_08;

public class ArrDemo {
	public static void main(String args[]) {
		int[][] arr = new int[2][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		
	
	for (int i[]:arr)
	{
		for(int j:i)
		{
			System.out.println(j+"/t");
		}
	}

}
}