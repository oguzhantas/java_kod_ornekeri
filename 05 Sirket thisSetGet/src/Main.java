/*
* NOT: ayn� dosya i�inde ise private
* �zelliklere eri�im m�mk�nd�r, farkl�
* dosyadan eri�im m�mk�n de�ildir. 
*/
public class Main {

	public static void main(String[] args) {
		
		Sirket abc= new Sirket();
	
		abc.setAdi("ABC Holding");
		abc.setCalisanSayisi(100);
		abc.setSermaye(1000000);

		System.out.println("�irket Ad�:"+abc.getAdi());
		System.out.println("�al��an Say�s�:"+abc.getCalisanSayisi());
		System.out.println("Sermaye:"+abc.getSermaye());
	}
}
