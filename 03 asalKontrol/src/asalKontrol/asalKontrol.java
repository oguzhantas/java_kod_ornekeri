package asalKontrol;
import java.util.Scanner;

public class asalKontrol {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		System.out.print("Bir say� giriniz:");
		int n = giris.nextInt(); 
		boolean asal= true;
		
		if (n==0 || n==1)
			asal= false;
		else {
			for(int i=2;i<n;i++)
			{
				if(n%i==0) {
					asal=false;
					break;
				}
					
			} //for
		} //else
		if (asal==true)
			System.out.println("Say� asal");
		else
			System.out.println("Asal de�il");

	}

}
