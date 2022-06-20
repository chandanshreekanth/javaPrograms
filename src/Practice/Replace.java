package Practice;

public class Replace 
{
	public static void main(String args[])
	{  
		String s1="LENOVO";  
		
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				char ch = (char) (s1.charAt(i)+32);
				System.out.print(ch);
			}
			else
			{
				System.out.print(s1.charAt(i));
			}
			
		}
		
		
		
		
		/*String nul="";
		String s2 = s1.replace('i','e');
		System.out.println(s2);*/
		
	/*	char[] s = s1.toCharArray();
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i]=='i')
			{
				s[i]='a';
				System.out.print(s[i]);
			}
			else
			{
				System.out.print(s[i]);
			}
			
		}
		*/
		System.out.println();
		String s = "lenovo";
		for (int i = 0; i < s.length(); i++) 
		{
			if (i%2==0) 
			{
				char ch = (char) (s.charAt(i)-32);
				System.out.print(ch);
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
