/*
 A�a��daki dizide en b�y�k eleman� bulup, 
 t�m elemanlar� enb�y�k elemandan farklar�n�n 
 fakt�riyelini yeni bir diziye yazd�r�n�z. 
 �rne�in a�a��daki dizide en b�y�k de�er 12�dir. 
 Yeni dizinin elemanlar� {2!,4!,5!,0!} olacakt�r, 
 sonu� dizisi {2,24,120,1} olacakt�r. 
 Fakt�riyel ve en b�y�k bulma i�lemleri 
 metod ile yap�lacakt�r (20 Puan)
int dizi[]= {10,8,7,12};

 * */
public class soru5 {
	
	public static int enBuyukBul(int a[]) {
		int enbuyuk=a[0];
		int elemanSayisi=a.length;
		for(int i=0;i<elemanSayisi;i++) {
			if(a[i]>enbuyuk)
				enbuyuk=a[i];
		}
		return(enbuyuk);
	}
	
	public static int faktoriyel(int n) {
		if(n==0 || n==1)
			return 1;
		else {
			int fakt=1;
			for(int i=1;i<=n;i++)
				fakt*=i;
			return(fakt);
		}
	}
	
	public static void main(String[] args) {
		int dizi[]= {10,8,7,12};
		//System.out.println(enBuyukBul(dizi));
		int enbuyuk=enBuyukBul(dizi);
		//System.out.println(faktoriyel(5));
		for(int i=0;i<dizi.length;i++)
		{
			dizi[i]=enbuyuk-dizi[i];
			System.out.print(dizi[i]);
			dizi[i]=faktoriyel(dizi[i]);
			System.out.println(" Fakt�riyeli:"+dizi[i]);
		}
		

	}

}
