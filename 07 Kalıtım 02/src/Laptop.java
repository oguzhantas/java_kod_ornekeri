
public class Laptop extends Bilgisayar{
	
	//�zellik
	boolean dokunmatikEkran;
	
	public Laptop(){ //Parametresiz yap�c� metod
		dokunmatikEkran=false;
	}
	
	//Parametreli Yap�c� Metod
	public Laptop(String _islemci, 
			String _bellekTipi,
			String _sabitDisk,
			String _ekranKarti, 
			double _fiyat) {
		islemci=_islemci;
		bellekTipi=_bellekTipi;
		sabitDisk=_sabitDisk;
		ekranKarti=_ekranKarti;
		fiyat=_fiyat;
	}
	
	//Metodlar
	public void ozellikYaz() {
		super.ozellikYaz();
		System.out.println("Dokunmatik :"+dokunmatikEkran);
	}
}
