package Practice;

public class StringDupliccate {

	public static void main(String[] args) 
	{
		String s="iam from mysore iam from";
		String words[]=s.split(" ");
		int count=1;
		for(int i=0;i<words.length;i++){
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])){
					count++;
					words[j]="0";
				}
			}
			if (count>1) 
			{
				if(words[i]!="0"){
					System.out.println(words[i]+"="+count);
				}
			}
			
			count=1;
		}

	}

}
