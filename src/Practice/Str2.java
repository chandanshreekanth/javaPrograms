package Practice;

public class Str2 
{
	public static void main(String[] args) 
	{
		String s1 = "i am mysore karnataka";
		String s2 = "i am bgl india"; 
		//o/p:mysore karnataka and bgl india
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		
		int count=0;
		for (int i = 0; i < str1.length; i++) 
		{
			for (int j = 0; j < str2.length; j++) 
			{
				if (str1[i].equals(str2[j])) 
				{
					count=1;
				}
			}
			if (count==0) 
			{
				System.out.print(str1[i]+" ");
			}
			count=0;
		}
		System.out.print(" and ");
		for (int i = 0; i < str2.length; i++) 
		{
			for (int j = 0; j < str1.length; j++) 
			{
				if (str2[i].equals(str1[j])) 
				{
					count=1;
				}
			}
			if (count==0) 
			{
				System.out.print(str2[i]+" ");
			}
			count=0;
		}
	}
}
