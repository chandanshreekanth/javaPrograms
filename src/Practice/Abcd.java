package Practice;

public class Abcd 
{
	public static void main(String[] args) 
	{
		String s="abcdefgh";
		//char[] str = s.toCharArray();
		String first = "";
		String second = "";
		for (int j = 0; j < s.length(); j++) 
		{
			if(j%2==0)
			{
				first=first+s.charAt(j);
			}
			
			else
			{
				second=second+s.charAt(j);
			}
		}
		System.out.print(first+" ");
		System.out.print(second);
//		for (int i = 0; i < str.length; i++) 
//		{
//			if(i%2==1)
//			{
//				second=second+str[i];
//			}
//		}
//		System.out.println(first+" "+second);
	}
}
