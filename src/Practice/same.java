package Practice;

public class same 
{
	public static void main(String[] args) 
	{
		String s="my name is chandan";
		String[] se = s.split(" ");
		System.out.println(se.length);
		for (int i = 0; i < se.length; i++) 
		{
			String str = se[i];
			String rev="";
			for (int j=str.length()-1;j>=0;j--) 
			{
			
				rev=rev+str.charAt(i);
				
			}
			System.out.println(rev);
		}
		
		
		
	}
}
