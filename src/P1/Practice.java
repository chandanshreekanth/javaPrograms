package P1;

public class Practice {
public static void main(String[] args) {
	String s="nyfmy jjftname isnbgftd sudhakar";
	String[] str=s.split(" ");
	for (int i = 0; i < str.length; i++) {
		System.out.print(str[i].substring(0,2));
	}
}
}
