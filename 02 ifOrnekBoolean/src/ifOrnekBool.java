import java.util.Scanner;

public class ifOrnekBool {

	public static void main(String[] args) {
		
		boolean gecti=true;
		Scanner giris = new Scanner(System.in);
		double yilSonuNotu;
		
		System.out.print("Y�l sonu notunuz:");
		yilSonuNotu=giris.nextDouble();
		
		if(yilSonuNotu>=50)
			gecti=true;
		else
			gecti=false;
		
		if(!gecti)
			System.out.println("Hangi derslerden ge�emediniz");
			//Derslerin adlar� al�nabilir
		
		else{
			System.out.print("�� buldunuz mu?");
			//Evet veya hay�r cevap al�r�z
			
		}
	}

}
