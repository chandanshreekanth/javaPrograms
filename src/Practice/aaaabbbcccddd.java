package Practice;

public class aaaabbbcccddd 
{
	public static void main(String[] args) 
	{
		String s="aaabbbcccddeefffffca ";
		
		for (int i = 0; i < s.length()-1; i++) 
		{
			if (s.charAt(i)!=s.charAt(i+1)) 
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
