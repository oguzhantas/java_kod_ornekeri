
public class Arac {

	//�zellikler
	String marka;
	int modelYili;
	String renk;
	int kiloMetre;
	String yakitTipi;
	double fiyat;
	
	public Arac() { //Yap�c� metod
		this.marka="Audi";
		this.modelYili=2022;
		System.out.println("Ara� s�n�f� yap�c� metodu �a�r�ld�");
	}
	
	public Arac(String _marka, 
			int _modelYili,
			String _renk,
			int _kiloMetre,
			String _yakitTipi,
			double _fiyat) { //Yap�c� metod

		this.marka = _marka;
		this.modelYili= _modelYili;
		this.renk = _renk;
		this.kiloMetre= _kiloMetre;
		this.yakitTipi = _yakitTipi;
		this.fiyat = _fiyat;
		
		
	}
	//Metodlar
	public void ozellikYaz() {
		System.out.println(marka);
		System.out.println(modelYili);
		System.out.println(renk);
		System.out.println(kiloMetre);
		System.out.println(yakitTipi);
		System.out.println(fiyat);
		
	} //ozellikYaz
}

