import java.util.Scanner;
public class MaasHesaplama {
	public static void main(String[] args) {
		byte gun, saat;
		double ucret, toplam;
		Scanner konsol= new Scanner(System.in);
		
		System.out.println("�al���lan g�n say�s�:");
		gun=konsol.nextByte();
		
		System.out.println("�al��t��� saat:");
		saat=konsol.nextByte();

		System.out.println("Saat ba�� �cret:");
		ucret=konsol.nextDouble();
		toplam= gun*saat*ucret;
		
		System.out.println("Toplam maa�:"+toplam);
	}
}
