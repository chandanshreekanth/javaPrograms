package Practice;

public class SegreateUpperandLower {
	public static void main(String[] args) {
		String s = "ChanDaN";
		String cap="";
		String small="";
		/*for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				System.out.println(s.charAt(i));

			}
		}

		System.out.println();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				System.out.println(s.charAt(i));
			}
		}*/
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
			cap=cap+s.charAt(i);
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				 
					small=small+s.charAt(i);
			}
			}
		System.out.print(cap);
		System.out.println();
		System.out.print(small);
		}
		
	
	
}
