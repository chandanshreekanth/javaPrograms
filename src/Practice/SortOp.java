package Practice;

import java.util.Scanner;

public class SortOp 
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	 int n = sc.nextInt();
	 int [] arr=new int[n];
	 System.out.println("Enter the array");
	 
	 for (int i = 0; i < n; i++) 
	 {
		arr[i]=sc.nextInt();
	}
	 
   
		
	//	int arr[]={a,b,c,d,e};]
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
