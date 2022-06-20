package P1;

public class Sawppp {
	public static void main(String[] args) {
		// ip = "abcdefgh"
		// op = "hbgdfeca"
		
		String str = "abcdefgh";
		String nstr = "";
		
		
		for (int i = 0; i < str.length()/2; i++) {
			
			nstr+=str.charAt(str.length()-1-i);
			nstr+=str.charAt(i+1);
			
		}
		
		System.out.println(nstr);
	
	}

}
