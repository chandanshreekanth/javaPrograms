package Practice;

public class ReverseWordAndString {

	
	public static void main(String[] args) {
		
		String s="my name is chandan";
		String[] s1 = s.split(" ");
		
		
		for (int i = s1.length-1; i >=0 ; i--)
		{
			String str = s1[i];
			
			for (int j = str.length()-1; j >=0 ; j--) 
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
		
		
	}
}
