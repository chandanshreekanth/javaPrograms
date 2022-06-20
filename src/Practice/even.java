package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class even 
{
	public static void main(String[] args) 
	{
		/*for (int i = 1; i <100; i++) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}*/
		
		//HashSet ch=new HashSet<>();
		HashMap ch=new HashMap<>();
		ch.put(1, 'a');
		ch.put(2,'b');
		ch.put(5,'c');
		ch.put(-1,'a');
		ch.put(2,'a');
		
		System.out.println(ch);
		
		
		
	}
}
