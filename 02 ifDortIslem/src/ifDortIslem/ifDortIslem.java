package ifDortIslem;
import java.util.Scanner;

public class ifDortIslem {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		double sayi1, sayi2, sonuc=0;
		char islem;
		boolean dortislem=true;
		System.out.print("1.say�y� giriniz:");
		sayi1 = giris.nextDouble();
		
		System.out.print("2.say�y� giriniz:");
		sayi2 = giris.nextDouble();
		
		System.out.print("��leminiz(+,*,/,-)");
		islem= giris.next().charAt(0);
		
		if(islem=='+'){
			sonuc=sayi1+sayi2;
		}else if(islem=='-'){
			sonuc=sayi1-sayi2;
		}else if(islem=='*'){
			sonuc=sayi1*sayi2;
		}else if(islem=='/'){
			sonuc=sayi1/sayi2;
		}else{
			System.out.println("d�rt i�lemden birini giriniz");
			dortislem=false;
		}
		if(dortislem==true)
		System.out.println("��lem sonucu:"+sonuc);
		

	}

}
