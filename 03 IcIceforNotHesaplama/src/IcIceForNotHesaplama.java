import java.util.Scanner;
public class IcIceForNotHesaplama {
	public static void main(String[] args) {
		
		Scanner giris= new Scanner(System.in);
		double ortalama=0, toplam=0, dnot=0;
		double ortalamaToplam=0, sinifOrtalama=0;
		//bu d�ng� ��renci say�s� kadar d�necek	
		for(int i=1;i<=2;i++) {
			//bu d�ng� ders say�s� kadar d�necek
			for(int j=1;j<=3;j++) {
				System.out.print(i+".��renci,"+j+".ders Notu:");
				dnot=giris.nextDouble();
				toplam+=dnot;
			} //for j
			ortalama= toplam/3; //ders say�s�na b�l�yoruz
			ortalamaToplam+=ortalama;
			System.out.println(i+".��renci ortalamas�:"+ortalama);
			
			ortalama=0;
			toplam=0;
		}//for i
		sinifOrtalama=ortalamaToplam/2; //��renci say�s�na 
		System.out.println("S�n�f ortalamas�:"+sinifOrtalama);
		
	}

}
