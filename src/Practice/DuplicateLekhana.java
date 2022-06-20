package Practice;

import java.util.LinkedHashSet;

public class DuplicateLekhana 
{
	public static void main(String[] args) 
	{
		String l="LekhanaDuplicate";
		String le = l.toLowerCase();
		System.out.println(le);
		LinkedHashSet<Character> ch=new LinkedHashSet<>();
		for (int i = 0; i <le.length() ; i++) 
		{
			ch.add(le.charAt(i));
		}
		System.out.println(ch);
		
		for (Character word : ch) 
		{
			int count=0;
			for (int i = 0; i <le.length(); i++) 
			{
				if (word.equals(le.charAt(i)))
				{
					count++;
				}
			}
			if (count>1) 
			{
				System.out.println(word+"="+count);

			}
		}
	}
}
