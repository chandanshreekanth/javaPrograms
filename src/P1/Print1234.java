package P1;

public class Print1234 {
public static void main(String[] args) {
	String s="12345";
	int count=1;
	boolean flag=true;
	while(flag){
		for (int i = 0; i < s.length(); i++) {
			int c=count;
			while(c>0)
			{
				System.out.print(s.charAt(i));
				c--;
			}
		}
		System.out.println();
		if(count==s.length())
		{
			flag=false;
			
		}
		count++;
		
	}
}
}
