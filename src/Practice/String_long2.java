package Practice;

import java.util.Scanner;

public class String_long2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter version");
		String s1 = scan.next();
		String Originals1 = s1;
		System.out.println("enter version");
		String s2 = scan.next();
		String Originals2 = s2;
		
		
	/*	String s1 = "1.025.1";
		String Originals1 = s1;
		String s2 = "2.01";
		String Originals2 = s2;*/
		
		
		if (s1.length()>s2.length()) 
		{
			for (int i =s2.length(); i <s1.length(); i++) 
			{
				s2=s2+'0';
			}
		}
		
		if (s2.length()>s1.length()) 
		{
			for (int i =s1.length(); i <s2.length(); i++) 
			{
				s1=s1+'0';
			}
		}
		String cd = s1.replaceAll("\\.", "");
		String dc = s2.replaceAll("\\.", "");
		
		long i = Integer.parseInt(cd);
		long j = Integer.parseInt(dc);
		
		if (i>j) 
		{
			System.out.println(Originals1);
		}
		
		else
		{
			System.out.println(Originals2);
		}
	}
}
