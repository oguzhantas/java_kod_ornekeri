
public class TernaryOperator2 {

	public static void main(String[] args) {
		
		int sayi=5;
		String sonuc=(sayi%2==0)
				?"�kiye b�l�n�r"
				:"�kiye B�l�nemez";
		System.out.println(sonuc);
		
		if(sayi%2==0)
			sonuc="�kiye b�l�n�r";
		else
			sonuc="�kiye b�l�nmez";
		System.out.println(sonuc);
	}

}
