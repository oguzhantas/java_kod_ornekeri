package iciceforOrtalama;
import java.util.Scanner;
public class iciceForOrtalama {
	public static void main(String[] args) {
		
	Scanner giris= new Scanner(System.in);	
	int ogrenciSayisi=2;
	int dersSayisi=3;
	double dnot=0, toplam=0, ortalama=0;
	
	for(int i=1;i<=ogrenciSayisi;i++) {
		for(int j=1;j<=dersSayisi;j++)
		{
			System.out.print(i+".��renci "+j+".ders notu:");
			dnot=giris.nextDouble();
			toplam+=dnot;
		} //ders say�s�
		
		ortalama= toplam/dersSayisi;
		System.out.println(i+". ��renci ortalamas�:"+ortalama);
		toplam=0; ortalama=0;
		
	} //for ��renci Say�s�
	

	}

}
