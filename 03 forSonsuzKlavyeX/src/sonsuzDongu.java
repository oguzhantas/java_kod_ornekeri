import java.util.Scanner;
public class sonsuzDongu {
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		char girilen='A';
		for(;girilen!='X';) {
			System.out.println("A) Kay�t Giri�");
			System.out.println("B) Kay�t Arama");
			System.out.println("C) Kay�t D�zeltme");
			System.out.println("D) Kay�t Silme");
			System.out.print("Se�iminiz:");
			girilen= giris.next().trim().charAt(0);
			 
			switch(girilen) {
			case 'A':
				System.out.println("Giri� se�ildi");
				break;
			case 'B':
				System.out.println("Arama se�ildi");
				break;
			case 'C':
				System.out.println("D�zeltme se�ildi");
				break;
			case 'D':
				System.out.println("Silme se�ildi");
				break;
			default:
				System.out.println("L�tfen A,B,C,D giriniz");
			}
			
			
		}

	}

}
