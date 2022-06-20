package Practice;

import java.util.Scanner;

public class Sort 
{
	public static void main(String[] args) 
	{
		//for(int k=0;k<=5;k++){
			
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values of array");
	 int a = sc.nextInt();
	 
    System.out.println("Enter the values of array");
		 int b = sc.nextInt();
		 
     System.out.println("Enter the values of array");
			 int c = sc.nextInt();
			
     System.out.println("Enter the values of array");
				 int d= sc.nextInt();
				 
	 System.out.println("Enter the values of array");
					 int e = sc.nextInt();
		
		int arr[]={a,b,c,d,e};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			//System.out.println(a[i]);
		}
		System.out.println("The maximum difference is");
		System.out.println( arr[arr.length-1]-arr[0]);
	}
}
