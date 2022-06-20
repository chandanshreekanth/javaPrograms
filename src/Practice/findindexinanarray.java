package Practice;

import java.util.LinkedHashSet;

public class findindexinanarray
{
	public static void main(String[] args)
	{
		int a[] = { 2,3,4,5,6,4,7};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
			System.out.print(a[i]);
		}
		for (Integer in : set)
		{
			for (int i = 0; i < a.length; i++)
			{
				if(a[i]==in)
				{
					System.out.print(in+" "+a[i]);
					break;
					
				}
				
				
				
			}
			
		}
		
		
	}

}
