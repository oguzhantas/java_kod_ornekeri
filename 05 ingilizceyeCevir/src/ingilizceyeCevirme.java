
public class ingilizceyeCevirme {

	public static String cevir(String metin) {
		
		char[] bilgi = metin.toCharArray();
		for(int i=0;i<metin.length();i++)
		{
			if(bilgi[i]=='�') bilgi[i]='C';
			else if(bilgi[i]=='�') bilgi[i]='S';
			else if(bilgi[i]=='�') bilgi[i]='O';
			else if(bilgi[i]=='�') bilgi[i]='U';
			else if(bilgi[i]=='�') bilgi[i]='G';
		}
		String sonuc=String.valueOf(bilgi);
		return(sonuc);
	}
	public static void main(String[] args) {
		String str="�AR�I ���D�";
		System.out.println(cevir(str));

	}

}
