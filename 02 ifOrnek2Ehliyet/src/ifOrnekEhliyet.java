import java.util.Scanner;

public class ifOrnekEhliyet {

	public static void main(String[] args) {
		
		int yas;
 		Scanner konsol = new Scanner(System.in);
 
 		System.out.print("Ya� giriniz:");
 		yas = konsol.nextInt();
 		if(yas>=18)
 			System.out.print("Ehliyet alabilirsiniz");
 		else
 			System.out.print("Ya��n�z hen�z k���k");

	}

}
