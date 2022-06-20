package P1;

public class Final 
{
	public static void main(String[] args) 
	{
		int no = 1234;
		for (int i = 0; i < 4; i++) 
		{
			int rem=no%10;
			no=no/10;
			System.out.print(rem);
		}
		
	}
}
