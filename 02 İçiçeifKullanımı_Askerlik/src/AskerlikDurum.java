import java.util.Scanner;
public class AskerlikDurum {
	public static void main(String[] args) {
		char cinsiyet;
		int dogumTarihi;
		int yas;
		
		Scanner konsol = new Scanner(System.in);
		System.out.print("Cinsiyetiniz:");
		cinsiyet = konsol.next().charAt(0);
		
		if(cinsiyet=='E' || cinsiyet=='e'){
			System.out.print("Do�um tarihiniz:");
			dogumTarihi=konsol.nextInt();
			yas=2021-dogumTarihi;
			
			if(yas>=18)
				System.out.print("Askere gidebilirsiniz");
			else
				System.out.print("Ya��n�z k���k");
			
		}else{
			System.out.print("K�zlara hen�z askerlik yok");
		}			
	}
}
