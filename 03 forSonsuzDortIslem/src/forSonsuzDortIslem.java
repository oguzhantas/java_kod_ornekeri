import java.util.Scanner;
public class forSonsuzDortIslem {
	public static void main(String[] args) {
		
		Scanner giris= new Scanner(System.in);
		char girilen='+';
		int sayi1=0, sayi2=0, sonuc=0;
		for(;;) {

			System.out.println("+)Toplama");
			System.out.println("-)��karma");
			System.out.println("*)�arpma");
			System.out.println("/)B�lme");
			System.out.println("X)��k��");
			
			System.out.print("Se�iminiz:");
			girilen=giris.next().charAt(0);	
			
			if (girilen!='X') {
				System.out.print("1. say�:");
				sayi1=giris.nextInt();
			
				System.out.print("2. say�:");
				sayi2=giris.nextInt();
			} 
			if(girilen=='+')
				sonuc=sayi1+sayi2;
			else if(girilen=='-')
				sonuc=sayi1-sayi2;
			else if(girilen=='*')
				sonuc=sayi1*sayi2;
			else if(girilen=='/') {
				if(sayi2!=0)
					sonuc=sayi1/sayi2;
				else
					System.out.println("S�f�ra b�l�nemez");
			} else if(girilen=='X')
				break;
			
			System.out.println("Sonu�:"+sonuc);
		} //for
		System.out.println("Program sonland�");
	} //main
}//class
