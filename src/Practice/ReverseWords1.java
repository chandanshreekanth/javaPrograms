package Practice;

public class ReverseWords1 
{
/*	public static void main(String[] args) 
	{
		String s="i.like.this.program";
		String str = s.replaceAll("\\.", " ");
		System.out.println(str);
		
		String[] st = str.split(" ");
		System.out.println(st.length);
		String rev="";
		for(int i=st.length-1;i>=1;i--)
		{
			rev=rev+st[i]+" ";
			System.out.println(rev);
		}*/
		
		
		public static void main(String[] args) 
		{
			String s="i.am.from.shivamogga";
			//Output-->shivamogga.from.am.i
			   String[] str = s.split("\\.",0);
			   for (int i =str.length-1;i>=0; i--) 
			   {
				   if(i!=0)
				   System.out.print(str[i]+'.');
				   else
				   {
					   System.out.print(str[i]);
				   }
			}
			   
			  
		}
		
		
		
		
		
		
		
		
		
		
		
	/*	String[] str = s.split("\\.");
		System.out.println(str.length);
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			if(i!=0)
			{
				rev=rev+str[i]+".";
				System.out.print(rev);
			}
			else
			{
		
				System.out.print(str[i]);
			}
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String rev="";
		//for(int i=s.length()-1;i>=0;i--)
		{
			//rev=rev+s.charAt(i);
		}
	//	System.out.println(rev);
	
}
