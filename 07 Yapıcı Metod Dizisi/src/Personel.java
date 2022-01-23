
public class Personel {

	String adi;
	String soyadi;
	String TC;
	String dogumYeri;
	
	public Personel() {
		dogumYeri="�stanbul";
	}
	
	public Personel(String _adi, 
					String _soyadi, 
					String _TC, 
					String _dogumYeri)
	{
		this.adi=_adi;
		this.soyadi=_soyadi;
		this.TC = _TC;
		this.dogumYeri=_dogumYeri;
	}
	
	public Personel(double[] maaslar){ //Yap�c� metodlara void yaz�lmaz
		double toplam=0;
		for(int i=0;i<maaslar.length; i++)
		{
			System.out.println((i+1)+".Maa� ="+maaslar[i]);
			toplam+=maaslar[i];
		}
		System.out.println("Toplam maa�:"+toplam);
	}
	
	public void yaz() {
		System.out.println("Ad�:"+this.adi);
		System.out.println("Soyad�:"+this.soyadi);
		System.out.println("TC:"+this.TC);
		System.out.println("Do�um yeri:"+this.dogumYeri);
		
	}
}
