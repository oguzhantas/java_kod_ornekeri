public class Otomobil extends Arac {
	
	//�zellik
	int yolcuSayisi;
	
	//metodlar
	public Otomobil() {
		System.out.println("Otomobil yap�c� s�n�f� �a�r�ld�");
	}
	
	
	public void yolcuTasi() {
		System.out.println(yolcuSayisi+" kadar yolcu ta��r");
	}
	
	public void ozellikYaz() 
	{
		
		super.ozellikYaz();
		System.out.println("Yolcu say�s�:"+yolcuSayisi);
	}

}



