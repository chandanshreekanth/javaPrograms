package Practice;

import java.util.LinkedHashSet;

public class demo 
{
	public static void main(String[] args) 
	{
		String s = "home sweet home";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (String word1 : str) 
		{
			set.add(word1);
		}
		System.out.println(set);
		
		for (String word2 : set) 
		{
			int count=0;
			for (String word3 : str) 
			{
				if (word3.equals(word2)) 
				{
					count++;
					
				}
				
			}
			System.out.println(word2+"="+count);
		}
	}
}
