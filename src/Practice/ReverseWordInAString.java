package Practice;

import java.util.Scanner;

public class ReverseWordInAString {
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		
		
		//String s = "i am swathi";
		String[] st = s.split(" ");
		
		for (int i = 0; i < st.length; i++) 
		{
			
			st[i]=st[i].substring(0, 1).toUpperCase()+st[i].substring(1, st[i].length());
			System.out.print(st[i]+" ");
         }
		System.out.println();
		for (int i =st.length-1; i >=0; i--) {
			System.out.print(st[i]+" ");
			
//			String str = st[i];
//			
//			for (int j =  str.length()-1; j >=0; j--) {
//				
//				//System.out.print(str.charAt(j)); ;
//			}
			System.out.print(" ");
		}
	}

}
