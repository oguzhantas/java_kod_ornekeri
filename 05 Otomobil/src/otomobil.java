public class otomobil {
	String renk; //�zellik
	int vitesSayisi; //�zellik
	String yakitTipi; //�zellik
	int yolcuSayisi;
	int maksimumHiz;
	int aktifHiz;
	
	public void hizlan(int hiz) {
		System.out.println("Araba h�zlan�yor");
		aktifHiz = aktifHiz+hiz;
	};
	
	public void yavasla(int hiz) {
		System.out.println("Araba yava�l�yor");
		aktifHiz = aktifHiz-hiz;
	};
	
	public void hizGoster() {
		System.out.println("�u andaki h�z�:"+aktifHiz);
	}

	public static void main(String[] args) {
		
		otomobil Mercedes = new otomobil();
		Mercedes.renk="Beyaz";
		Mercedes.vitesSayisi=7;
		Mercedes.yakitTipi="Dizel";
		Mercedes.yolcuSayisi=5;
		
		System.out.println("Renk:"+Mercedes.renk);
		System.out.println("Vites say�s�:"+Mercedes.vitesSayisi);
		System.out.println("Yak�t Tipi"+Mercedes.yakitTipi);
		System.out.println("Yolcu say�s�:"+Mercedes.yolcuSayisi);
		Mercedes.hizlan(20);
		Mercedes.hizGoster();
		Mercedes.hizlan(30);
		Mercedes.hizGoster();
		Mercedes.yavasla(15);
		Mercedes.hizGoster();
	
		
	}

}
