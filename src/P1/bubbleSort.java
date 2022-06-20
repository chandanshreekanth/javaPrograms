package P1;

public class bubbleSort {
public static void main(String[] args) {
	int[] a={10,23,38,45,22,43};
	int t=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			
				if (a[i]<a[j]) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			}
		}
			for (int i = 0; i < a.length; i++) {
				
				System.out.print(a[i]+" ");	
				
			}
		
	
}
}
