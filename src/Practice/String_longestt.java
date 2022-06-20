package Practice;

import java.util.Scanner;

public class String_longestt 
{
	public static void main(String[] args) 
	{
		String a="1.022";
		String b="1.04";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter version");
		String c = scan.next();
		System.out.println("enter version");
		String d = scan.next();
//		String c = "1.001.2001";
//		String d= "1.201.2001";
//		String e = "1.3.21";
		
		
		String cd = c.replaceAll("\\.", "");
		String dc = d.replaceAll("\\.", "");
		//System.out.println(cd);
		//System.out.println(dc);
		
		int i = Integer.parseInt(cd);
		int j = Integer.parseInt(dc);
		
		if (i>j) 
		{
			System.out.println(c);
		}
		
		else
		{
			System.out.println(d);
		}
				
		/*System.out.println(e+""+0);
		double i = Double.parseDouble(a);
		double j = Double.parseDouble(b);
		float k = Float.parseFloat(a);
		System.out.println(k);
		if (i>j) 
		{
			System.out.println(i);
		}
		
		else
		{
			System.out.println(j);
		}
		*/
	}
}
