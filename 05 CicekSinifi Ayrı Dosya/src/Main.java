
public class Main {

	public static void main(String[] args) {
		Cicek gul = new Cicek();
		gul.renk="k�rm�z�";
		gul.fiyat=20;
		
		System.out.println("�i�ek ad�:"+gul.renk);
		System.out.println("�i�ek fiyat�:"+gul.fiyat);
		gul.fiyatArtir(15);
		System.out.println("�i�ek fiyat�:"+gul.fiyat);		
		gul.fiyatArtir(10);
		System.out.println("�i�ek fiyat�:"+gul.fiyat);		
	}

}
