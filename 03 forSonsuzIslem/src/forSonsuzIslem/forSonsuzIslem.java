package forSonsuzIslem;

import java.util.Scanner;
public class forSonsuzIslem {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		char secim;
		int s1=0, s2=0;
		double sonuc=0;
		for(;;) {
					
			System.out.println("+) Toplama");
			System.out.println("-) ��karma");
			System.out.println("/) B�lme");
			System.out.println("*) �arpma");
			System.out.println("X) ��k��");
			System.out.print("Se�iminiz:");
			secim= giris.next().charAt(0);
			
			if (!(secim=='X' || secim=='x')) {
				System.out.print("1. say�:");
				s1= giris.nextInt();
				
				System.out.print("2. say�:");
				s2= giris.nextInt();
			}
			

			if(secim=='X' || secim=='x') 
				break;
			else if(secim=='+')
				sonuc=s1+s2;
			else if(secim=='*')
				sonuc=s1*s2;
			else if(secim=='-')
				sonuc=s1-s2;
			else if(secim=='/') {
				if(s2==0)
					System.out.println("S�f�ra b�l�nemez");
				else
					sonuc=(double)s1/s2;
			}
			else{
					System.out.println("+,-,*,/ i�aretlerinden birini giriniz");
					break;
				}
			
			System.out.println("Sonu�:"+sonuc);
			
		}//for
		System.out.print("Programdan ��k�ld�");
		

	}

}
