package Practice;

import java.util.Scanner;

public class Skip 
{
	public static void main(String[] args) 
	{
		//i/p=2,7,10
		//o/p=3 4 5 6 8 9
		/*Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of first number");
		int x=scan.nextInt();
		System.out.println("enter the value of 2 number");
		int z=scan.nextInt();
		System.out.println("enter the value of 3 number");
		int y=scan.nextInt();
	*/
		
		
		
		for (int i=2+1 ; i <10; i++) 
		{
			if(i==7)
				continue;
			System.out.println(i);
		}
	}
}
