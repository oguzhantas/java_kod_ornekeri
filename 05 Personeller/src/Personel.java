public class Personel {
	String adi;
	String soyadi;
	int dogumYili;
	String TCKimlikNo;
	double maas, prim;
	String gorevi;
	
	public Personel() {
		gorevi="Memur";
	}
	
	public double aylikHesapla() {
		return(maas+prim);
	}
	public int yasHesapla(int dogumYili) {
		return(2021-dogumYili);
	}
	
	public static void main(String[] args) {
		
		Personel p1=new Personel();
		p1.adi="Sinan";
		p1.soyadi="Can";
		p1.gorevi="G�venlik";
		p1.maas=5000;
		p1.prim=500;
		int yas=p1.yasHesapla(1976);
		System.out.println(p1.adi+" "+p1.soyadi+" ya��:"+yas);
		System.out.println("G�revi:"+p1.gorevi);
		double aylik=p1.aylikHesapla();
		System.out.println("Ayl�k ele ge�en:"+aylik);
		
		Personel p2=new Personel();
		p2.adi="Yeliz";
		p2.soyadi="Sucu";
		p2.maas=4000;
		p2.prim=400;
		yas=p2.yasHesapla(1985);
		System.out.println(p2.adi+" "+p2.soyadi+" ya��:"+yas);
		System.out.println("G�revi:"+p2.gorevi);
		aylik=p2.aylikHesapla();
		System.out.println("Ayl�k ele ge�en:"+aylik);
		
	}
}
