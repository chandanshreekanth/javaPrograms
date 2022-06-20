package P1;

public class asceBubble {
public static void main(String[] args) {
	int[] a={21,32,12,87,49,83,92};
	//int t=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	for (int i=a.length-1;i>=0; i--) {
		System.out.print(a[i]+" ");
	}
}
}
