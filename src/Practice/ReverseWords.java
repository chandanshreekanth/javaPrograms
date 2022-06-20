package Practice;

public class ReverseWords 
{
	public static void main(String[] args) 
	{
		
		String s="i am chandan";
		String[] a = s.split(" ");
		System.out.println(a.length);
		
		for (int j=a.length-1;j>=0;j--) 
		{
			
		System.out.print(a[j]+" ");
		}
	}
}
