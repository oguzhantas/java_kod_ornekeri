import java.io.FileWriter;
import java.io.IOException;

public class DosyaIslemleri {

	public static void main(String[] args) throws IOException {
	
		String sehir="�stanbul";
		FileWriter dosya=new FileWriter("cikis.txt");
		  
		      
		for (int i = 0; i < sehir.length(); i++)
		      dosya.write(sehir.charAt(i));
		
		  
		System.out.println("Ba�ar�yla yaz�ld�");
		dosya.close();
	}
}
