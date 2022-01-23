/*gectiKaldi �eklinde bir metod yaz�n�z, 
 * g�nderilen say�(n) 50�den b�y�k e�itse true, 
 * 50�den k���k ise false d�nd�rs�n.
a)	puanHesapla isimli di�er bir metod ile 
gectiKaldi metodundan true d�nd�r�yorsa 
a�a��daki kurallara g�re puan hesaplay�n�z.
50<not<54 ise 2;
55<not<69 ise 3;
70<not<84 ise 4;
85<not<100 ise 5 d�nd�r�n�z. 
b)	mesajVer isimli di�er bir metod ile gectiKaldi metodundan false d�n�yorsa ekrana
�Daha �ok �al��mal�s�n� mesaj� yazd�r�n�z. 
*/

import java.util.Scanner;

public class soru6 {
	
	public static boolean gectiKaldi(double n) {
			if(n>=50) return true;
			else return false;
	}
	
	public static void mesajVer() {
		System.out.print("Daha �ok �al��mal�s�n");
	}
	
	public static int puanHesapla(double puan) {
		int sonuc=0;
		if(gectiKaldi(puan))
		{
			if(puan>=50 && puan<=54)
				sonuc=2;
			else if(puan>=55 && puan<=69)
				sonuc=3;
			else if(puan>=70 && puan<=84)
				sonuc=4;
			else if(puan>=85 && puan<=100)
				sonuc=5;
		}else mesajVer();
		return(sonuc);
		
	}
	
	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		System.out.print("Puan� giriniz:");
		int p= giris.nextInt();
		System.out.print("Notunuz:"+puanHesapla(p));

	}

}
