
public class Masa extends Metal{

	int genislik;
	int yukseklik;
	
	//A�a��daki metod hata verir.
	//��nk� s�per s�n�fta final olarak tan�mlanm��t�r.
	//public void simgeYaz() {
	//	System.out.print("Simge yaz�l�yor");
	//}
	
	
	public void alanHesapla() {
		System.out.println("Masa alan�:"+genislik*yukseklik);
	}
}
