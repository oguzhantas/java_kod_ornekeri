import java.util.Scanner;
public class whileNotOrtalama {
	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		int i=0;
		double n, ortalama=0, toplam=0;
		while(true) {
			System.out.print((i+1)+". ��renci notu:");
			n=giris.nextDouble();
			if(n==-1) 
				break;
			else {
				toplam+=n;
				i++;
			}
		}
		System.out.println("��renci say�s�:"+i);
		ortalama=toplam/i;
		System.out.println("Ortalama:"+ortalama);
	}
}
