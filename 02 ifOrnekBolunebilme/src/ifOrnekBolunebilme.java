import java.util.Scanner;
public class ifOrnekBolunebilme {

	public static void main(String[] args) {
		Scanner konsol= new Scanner(System.in);
		System.out.println("Say� giriniz:");
		byte sayi=konsol.nextByte();
		
	if (sayi%2==0 && sayi%3==0)
		System.out.println("Say� 2'ye ve 3'e b�l�n�r");
	else if(sayi%2==0 || sayi%3==0){ 
			if (sayi%2==0)
			System.out.println("Say� 2'ye b�l�n�r");
			else if(sayi%3==0)
			System.out.println("Say� 3'e b�l�n�r");
	} else{
		System.out.println("Say� 2 ve 3'e b�l�nemez");
	}	
 }
}
