package forSonsuzIslemler;
import java.util.Scanner;
public class forSonsuzIslem {
	public static void main(String[] args) {
		
		char bilgi='+';
		int s1=0, s2=0;
		double sonuc=0;
		Scanner giris= new Scanner(System.in);
	
	for(; !(bilgi=='X' || bilgi=='x');) { //X se�ilmedi�i s�rece d�n
		
		System.out.println("+) Toplama");
		System.out.println("-) ��karma");
		System.out.println("*) �arpma");
		System.out.println("/) B�lme");
		System.out.println("X) ��k��");
		System.out.println("");
		
		System.out.print("Se�iminiz:");
		bilgi= giris.next().charAt(0);
		
		if(!(bilgi=='X'|| bilgi=='x')) {
			System.out.print("1. say�:");
			s1= giris.nextInt();
			
			System.out.print("2. say�:");
			s2= giris.nextInt();
		} //if
		
		
		if(bilgi=='+')
			{sonuc=s1+s2;}
		else if(bilgi=='-')
			{sonuc=s1-s2;}
		else if(bilgi=='*')
			{sonuc=s1*s2;}
		else if(bilgi=='/') {
			if(s2==0)
				System.out.println("S�f�ra b�lme hatas�");
			else 
				sonuc=(double)s1/s2;
		}else if(bilgi=='X' || bilgi=='x') {
			System.out.println("��k�� se�ildi");
		}
		
		else {
			System.out.println("D�rt i�lem sembol� giriniz");
		}
		
		if(bilgi!='X')
			System.out.println("Sonu�:"+sonuc);
	} //for biti�
		

	} //main

} //class
