
public class Kamyon extends Arac {
	
	int yukKapasitesi;
	
	public void yukTasi() {
		System.out.println(yukKapasitesi+" kadar y�k ta��r");
	}
	
	public void ozellikYaz() {
		super.ozellikYaz();
	
		System.out.println("Y�k Kapasitesi:"+yukKapasitesi);
	}

}
