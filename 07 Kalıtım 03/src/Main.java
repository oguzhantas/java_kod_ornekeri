
public class Main {

	public static void main(String[] args) {
		System.out.println("Hayvan s�n�f�ndan nesne olu�turuluyor");
		
		Hayvan h1= new Hayvan();
		h1.beslen();
		h1.uyu();
		
		System.out.println("Kedi s�n�f�ndan nesne olu�turuluyor");
		Kedi tekir = new Kedi();
		tekir.beslen();
		tekir.uykuyaDal();
		tekir.kediOzellikYaz();
		
		/*System.out.println("�ita s�n�f�ndan nesne olu�turuluyor");
		Cita c1= new Cita();
		c1.beslen();
		*/

	}

}
