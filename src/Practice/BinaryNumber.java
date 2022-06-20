package Practice;

public class BinaryNumber 
{
	public static void main(String[] args) 
	{
	/*	int n=125;
		int sum = 0;
		while(n>0)
		{
			int dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
		System.out.println(sum);*/
		
		int n=125;
		String b="";
		int t=n;
		while(t>0)
		{
			int rem=t%2;
			t=t/2;
			b=rem+b;
			
		}
		System.out.println(b);
	}
}
