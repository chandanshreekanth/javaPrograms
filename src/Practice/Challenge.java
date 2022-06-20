package Practice;

public class Challenge 
{
	public static void main(String[] args) 
		{
		String s1="My Name is Chandan";
		//Expected output--->My0Name0is0Chandan
		String s2="";
		int n=s1.length();
		for(int i=0;i<n;i++)
		{
			char v=s1.charAt(i);
			if(v==' ')
			{
				s2=s2+0;
			}
			else
			{
				s2=s2+s1.charAt(i);
				
			}
		}
		System.out.println(s2);
		}
}
