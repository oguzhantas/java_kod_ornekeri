
public class calismaSaatleri {

	public static void main(String[] args) {
		
		///bir i��inin �al��ma saatleri
		int saatler[] = {8,10,8,8,7,8};
		int toplam=0;
		for(int i=0;i<saatler.length;i++)
		{
			toplam+=saatler[i];
		}
		
		double ortalama= (double)toplam/saatler.length;
		System.out.println("Ortalama �al��ma saati:"+ortalama);
		
		
		
	}

}
