package Practice;

import java.util.LinkedHashSet;

public class String1 
{
	public static void main(String[] args) 
	{
		/*String s1="hello i am chandan i am from banglore";
		String[] se1 = s1.split(" ");
		String s2="hello i am arvin i am from india";
		String[] se2 = s2.split(" ");
		//o/p: chandan banglore and arvin india
		
//		if (se1[0]==se2[0]) 
//		{
//			System.out.println(se1[0]);
//		}
//		if (se1[0].equals(se2[0])) 
//		{
//			System.out.println(se1[0]);
//		}
		for (int i = 0; i < se1.length; i++) 
		{
			for (int j = 0; j < se2.length; j++) 
			{
				int count=0;
				if (se1[i].equals(se2[j])) 
				{
					
					System.out.println(se1[i]);
					break;
				}
//				if (se1[i]==se2[j]) 
//				{
//					count++;
//					System.out.println(se1[i]);
//				}
			//	System.out.println(count);
			}
		}
		//System.out.println(se1[1]);
*/		
		String s1="i am chandan";
		String[] se1 = s1.split(" ");
		String s2="i am likhitha";
		String[] se2 = s2.split(" ");
		//o/p: Aishwarya banglore and Angadi india
		String s3 = s1+" "+s2;
		System.out.println(s3);
		String[] s4 = s3.split(" ");
		LinkedHashSet<String> str=new LinkedHashSet<>();
		for (int i = 0; i < s4.length; i++) 
		{
			str.add(s4[i]);
			//str.remove(s4[i]);
		}
		
		System.out.println(str);
//		for (String sh : se1) 
//		{
//			for (int i = 0; i < se1.length; i++) 
//			{
//				if(sh.equals(se2[i]))
//				{
//					System.out.println(se1[i]);
//				}
//			}
//		}
	}
}
