package forSonsuzMenu2;

import java.util.Scanner;

public class forSonsuzMenu2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		char bilgi='A';
		
		for(;bilgi!='X';) {
			System.out.println("A) Kay�t Giri�");
			System.out.println("B) Kay�t Arama");
			System.out.println("C) Kay�t D�zeltme");
			System.out.println("D) Kay�t Silme");
			System.out.println("X) ��k��");
			System.out.print("Se�iminiz:");
			bilgi=giris.next().charAt(0);
			
			switch(bilgi) {
			case 'A':
				System.out.println("Giri� se�ildi");
				break;
			case 'B':
				System.out.println("Arama se�ildi");
				break;
			case 'C':
				System.out.println("D�zeltme se�ildi");
				break;
			case 'D':
				System.out.println("Silme se�ildi");
				break;
			case 'X':
				System.out.println("��k�ld�");
	 			break;
			default:
				System.out.println("A,B,C,D,X harflerinden birini giriniz:");
			} //switch
			
			//if (bilgi=='X') break;
		} //for biti�
			
			System.out.println("Programdan ��k�ld�");

	}

}
