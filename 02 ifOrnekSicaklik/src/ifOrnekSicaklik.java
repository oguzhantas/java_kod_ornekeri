import java.util.Scanner;
public class ifOrnekSicaklik {
	public static void main(String[] args) {
	
		Scanner giris = new Scanner(System.in);
		System.out.println("S�cakl�k giriniz:");
		int s= giris.nextInt();
		
		if(s<0)
			System.out.println("Kat� halde");
		else if(s>=0 && s<100)
			System.out.println("S�v� halde");
		else if(s>=100)
			System.out.println("Gaz halinde");

	}

}
