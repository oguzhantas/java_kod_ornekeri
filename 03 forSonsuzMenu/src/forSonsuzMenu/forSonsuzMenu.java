package forSonsuzMenu;

import java.util.Scanner;
public class forSonsuzMenu {

	public static void main(String[] args) {

		Scanner giris= new Scanner(System.in);
		char girilen='A';
		
		for(;girilen!='X';) {
			System.out.println("A) Kay�t Giri�");
			System.out.println("B) Kay�t D�zeltme");
			System.out.println("C) Kay�t Silme");
			System.out.println("D) Kay�t Arama");
			System.out.print("Se�iminiz(��kmak i�in X):");
			girilen= giris.next().charAt(0);
			
			switch(girilen) {
			case 'A':
				System.out.println("Giri� se�ildi");
				break;
			case 'B':
				System.out.println("D�zeltme se�ildi");
				break;
			case 'C':
				System.out.println("Silme se�ildi");
				break;
			case 'D':
				System.out.println("Arama se�ildi");
				break;
			
			
			}
		} //for biti�
		System.out.println("Programdan ��k�ld�");
	
		

	}

}
