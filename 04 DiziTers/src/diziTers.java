
public class diziTers {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		//a dizisinin uzunlu�u kadar b dizisi a�al�m
		int n=a.length;
		int b[] = new int[n];
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		for(int i=0;i<n;i++)
			b[i]=a[n-i-1];
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}

}
