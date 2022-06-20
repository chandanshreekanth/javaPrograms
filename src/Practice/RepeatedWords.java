package Practice;

public class RepeatedWords {
	public static void main(String[] args) {
		String s="carbush6uc6tarcarbuscar";
		String s1="";
		int n=s.length();
		int count=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='c'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='r')
			{
				count++;
			}
		}
		System.out.println("car count is "+count);
	}

}
