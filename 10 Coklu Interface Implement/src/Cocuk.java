interface bir{
	public void Yaz();
}

interface iki{
	public void ikiYaz();
}

interface uc extends bir,iki{
	public void Yaz();
}

public class Cocuk implements uc {
	public void Yaz() {
		System.out.println("Bilgi yaz�l�yor");
		
	}
	public void ikiYaz() {
		System.out.println("�ki yaz�l�yor");
		
	}
}
