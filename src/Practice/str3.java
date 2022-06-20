package Practice;

import java.util.LinkedHashSet;

public class str3 
{
	public static void main(String[] args) 
	{
		String s1 = "i am mysore karnataka";
		String s2 = "i am bgl india"; 
		//o/p:mysore karnataka and bgl india
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		
		String s3 = s1+" "+s2;
		System.out.println(s3);
		String[] str3 = s3.split(" ");
		//i am mysore karnataka i am bgl india
		//[i, am, mysore, karnataka, bgl, india]
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = 0; i < str3.length; i++) 
		{
			set.add(str3[i]);
		}
		System.out.println(set);
		int count=0;
		for (int j = 0; j < str3.length; j++) 
		{
			for (String st : set) 
			{
				if (st.equals(str3[j])) 
				{
					count++;
					continue;
				}
				
			}
			if (count==1) 
			{
				System.out.println(str3[j]);
			}
			count=0;
			
		}
		
		
		
}
}
