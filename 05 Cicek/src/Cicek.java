
public class Cicek {
	
	String cicekAdi; //�i�ek s�n�f�n�n �zelli�i
	double fiyat;
	
	public void isminiYaz() {
		System.out.println(cicekAdi);
	}
	
	public void fiyatYaz() {
		System.out.println("Fiyat�:"+fiyat);
	}
	
	public static void main(String[] args) {
		Cicek gul=new Cicek();
		gul.cicekAdi="K�rm�z� G�l";
		gul.fiyat=20;
		gul.isminiYaz();
		gul.fiyatYaz();
		
		Cicek papatya=new Cicek();
		papatya.cicekAdi="Sar� papatya";
		papatya.fiyat=15;
		papatya.isminiYaz();
		papatya.fiyatYaz();
	}
}
