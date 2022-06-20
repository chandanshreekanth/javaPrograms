package Practice;

public class MaxMinusMin 
{
	public static void main(String[] args) 
	{
		int arr[]={500,6,4,90,8};
		int min=arr[4];
		int max=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		//System.out.println(max);
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		int res=max-min;
		System.out.println(res);
	}
}
