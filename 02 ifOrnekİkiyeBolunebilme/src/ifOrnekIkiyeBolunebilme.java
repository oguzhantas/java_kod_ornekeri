import java.util.Scanner;
public class ifOrnekIkiyeBolunebilme {

	public static void main(String[] args) {
		
		byte sayi;
		Scanner konsol= new Scanner(System.in);
		System.out.println("Say� giriniz:");
		sayi=konsol.nextByte();
		
		if (sayi%2==0)
			System.out.println("�kiye b�l�n�r");
		else
			System.out.println("�kiye b�l�nemez");

	}

}
