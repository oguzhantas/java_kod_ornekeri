package ifOrnekGununSaatleri;
import java.util.Scanner;
public class ifOrnekGununSaatleri {

	public static void main(String[] args) {

		Scanner giris= new Scanner(System.in);
		System.out.println("G�n�n saatini giriniz:");
		int saat = giris.nextInt();
		
		if (saat>=6 && saat<12)
			System.out.println("G�nayd�n");
		else if(saat>=12 && saat<17)
			System.out.println("T�nayd�n");
		else if(saat>=17 && saat<20)
			System.out.println("�yi ak�amlar");
		else if(saat>=20 && saat<24)
			System.out.println("�yi geceler");
		else if(saat>=0 && saat<6)
			System.out.println("�yi uykular");
		
	}
}
