
public class Hayvan {

	//A�a��daki �zellik t�m t�retilen s�n�flarda kullan�labilir.
	public static int ayakSayisi=4;

	public Hayvan() {
		System.out.println("Hayvan yap�c� metodu �a�r�ld�");
	}
	
	public void beslen() {
		System.out.println("Besleniyor..");
	}
	
	public void uyu() {
		System.out.println("Uyuyor...");
	}
	
	final void zipla() {
		System.out.println("Z�pl�yor...");
	}
	
}
