
public class Kitap {

	String kitapAdi;
	double fiyat;
	int sayfaSayisi;
	
	//Yap�c� s�n�f tan�ml�yoruz	
	public Kitap() { 
		sayfaSayisi=250;
		fiyat=25;
	}
	//Parametreli yap�c� metodu
	public Kitap(String kitap_adi, int sayfa_sayisi, double kitap_fiyat) {
		kitapAdi=kitap_adi;
		sayfaSayisi=sayfa_sayisi;
		fiyat = kitap_fiyat;
	}
	
	public void fiyatArtir(double zam) {
		fiyat+=zam;
	}
	
	public void fiyatAzalt(double indirim) {
		fiyat-=indirim;
	}
	
	public void fiyatYuzdeArtir(int oran) {
		fiyat+=fiyat*oran/100;
	}
	
	public void fiyatYuzdeAzalt(int oran) {
		fiyat-=fiyat*oran/100;
	}
	
	public static void main(String[] args) {
		
		Kitap k1=new Kitap();
		k1.kitapAdi="Ka�a��";
		k1.fiyat=20;
		k1.sayfaSayisi=200;
		
		//k1.fiyatArtir(15);
		//k1.fiyatAzalt(5);
		//k1.fiyatYuzdeArtir(10);
		k1.fiyatYuzdeAzalt(5);
		System.out.println("Kitap ad�:"+k1.kitapAdi);
		System.out.println("Fiyat�:"+k1.fiyat);	
		System.out.println("Sayfa Say�s�:"+k1.sayfaSayisi);
		
		
		
		System.out.println("===");
		Kitap k2 = new Kitap();
		k2.kitapAdi="�u ��lg�n T�rkler";
		k2.sayfaSayisi=400;
		System.out.println("Kitap ad�:"+k2.kitapAdi);
		System.out.println("Fiyat�:"+k2.fiyat);	
		System.out.println("Sayfa Say�s�:"+k2.sayfaSayisi);
		

	}

}
