
public class Kopek extends Hayvanlar {

	String kopekTur;
	
	//Bu metod Hayvanlar s�n�f�ndaki sesCikar metodunu
	// eziyor(override)
	public void sesCikar() {
		System.out.println("Havl�yor...");
	}
	
	public void avlan() {
		System.out.println("K�pek avlan�yor...");
	}
}
