import java.util.Scanner;
public class forFaktoriyel1 {
	public static void main(String[] args) {

		Scanner giris= new Scanner(System.in);
		System.out.print("Fakt�riyeli al�ncak say�:");
		int n= giris.nextInt();
		
		if (n==0) 
			System.out.println("Sonu�:"+1);
		else {
			int fakt=1;
			for(int i=1;i<=n;i++) {
				System.out.println("De�er:"+fakt);
				fakt=fakt*i;
			}
			System.out.println("Sonu�:"+fakt);
		}
	}
}
