
public class Main {

	public static void yaz(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Yiyecek y1=new Yiyecek();
		y1.setAdi("Pilav");
		y1.setFiyat(7.5);
		yaz("Ad� :"+y1.getAdi());
		yaz("Fiyat�:"+y1.getFiyat());
	}

}
