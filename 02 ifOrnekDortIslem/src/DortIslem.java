import java.util.Scanner;

public class DortIslem {

	public static void main(String[] args) {
		int s1,s2, sonuc=0;
		char islem;
 		Scanner konsol = new Scanner(System.in);
 
 		System.out.print("1.say�y� giriniz:");
 		s1 = konsol.nextInt();
 		
 		System.out.print("2.say�y� giriniz:");
 		s2 = konsol.nextInt();

 		System.out.print("��lemi giriniz:");
 		islem = konsol.next().charAt(0);
 		
 		if(islem=='+')
 			sonuc=s1+s2;
 		else if(islem=='-')
 			sonuc=s1-s2;
 		else if(islem=='*')
 			sonuc=s1*s2;
 		else if(islem=='/')
 			sonuc=s1/s2;
 		else
 			System.out.println("Tan�ms�z ��lem");
 		
 		System.out.print("Sonu�:"+sonuc);
	}

}
