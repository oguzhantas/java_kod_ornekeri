import java.util.Scanner;
public class sayiDogrusu {

	public static void main(String[] args) {
		Scanner konsol= new Scanner(System.in);
		System.out.println("Say� giriniz:");
		short sayi=konsol.nextShort();
		
		if(sayi>0)
			System.out.println("Pozitif say�");
		else if(sayi<0)
			System.out.println("Negatif say�");
		else
			System.out.println("Girilen say� S�f�r");

	}

}
