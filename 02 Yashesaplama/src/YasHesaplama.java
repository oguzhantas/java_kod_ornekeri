import java.util.Scanner;

public class YasHesaplama {

	public static void main(String[] args) {
		Scanner konsol= new Scanner(System.in);
		System.out.println("Do�um tarihiniz:");
		short dogumTarihi=konsol.nextShort();
		byte yas= (byte)(2021-dogumTarihi);
		System.out.println("Ya��n�z:"+yas);
	
	}

}
