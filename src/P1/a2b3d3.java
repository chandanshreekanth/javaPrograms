package P1;

public class a2b3d3 {
public static void main(String[] args) {
	String s="a2b3d3";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)>='0'&& s.charAt(i)<='9')
		{
			for (int j = 1; j <= s.charAt(i)-48; j++) {
				System.out.print(s.charAt(i-1));
			}
		}
	}
}
}
