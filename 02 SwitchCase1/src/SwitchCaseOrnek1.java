import java.util.Scanner;

public class SwitchCaseOrnek1 {

	public static void main(String[] args) {
	
	byte secim;
	System.out.print("1)�lkbahar");
	System.out.print("2)Yaz");
	Scanner konsol= new Scanner(System.in);
	secim=konsol.nextByte();
	
	switch (secim){
	case 1:
		System.out.println("Mart-Nisan-May�s");
		break;
	case 2:
		System.out.println("Haziran-Temmuz-A�ustos");
		break;
	default:
		System.out.println("1 veya 2 giriniz");
	}
		

	}

}
