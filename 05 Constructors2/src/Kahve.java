
public class Kahve {
	String kahveCekirdek;
	double kahveFiyat;
	
	public Kahve(String cekirdek, double fiyat) {
		kahveCekirdek=cekirdek;
		kahveFiyat=fiyat;
			
	}
	
	public static void main(String[] args) {
			Kahve k1= new Kahve("Java",17);
			System.out.println("Kahve �ekirde�i:"+k1.kahveCekirdek);
			System.out.println("Kahve Fiyat�:"+k1.kahveFiyat);
			
			Kahve k2= new Kahve("Peru", 20);
			System.out.println("K.�ek:"+k2.kahveCekirdek);
			System.out.println("K.Fiyat:"+k2.kahveFiyat);

	}

}
