
public class AnaSinif {

	static void benimStatikMetod()
	{
		System.out.println("Statik s�n�flar� kullanmak i�in nesne olu�turulmaz");
	}
	
	public void benimPublicMetod() {
		System.out.print("Bu metod public");
		System.out.println("nesne olu�turulmadan kullan�lmaz");
	}
	public static void main(String[] args) {
		
			benimStatikMetod();
			AnaSinif a = new AnaSinif();
			a.benimPublicMetod();
	}

}
