abstract class insan{
	
	 String adi="Ali";
	 int yas=45;
	 int mezunYili=2021;
	 abstract void calis(); //soyut metod
	 abstract void oku();
}


 class Ogrenci extends insan{
		
		public void calis() {
			System.out.println("�al��, daha �ok �al��");
		}
		
		public void oku() {
			System.out.println("Okuma yap�l�yor...");
		}
		
		public static void main(String[] args) {
			insan o1= new Ogrenci();
			
			System.out.println("Ad�:"+o1.adi);
			System.out.println("Ya�:"+o1.yas);
			System.out.println("Mezuniyet Y�l�:"+o1.mezunYili);
			
			o1.calis();

		}
}
	





