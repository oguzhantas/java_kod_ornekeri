import java.text.DecimalFormat;

public class KusuratliArtim {

	public static void main(String[] args) {

		// -2'den ba�lay�p 1'e kadar 0.1 aral�klarla
		// giden bir d�ng� olu�tural�m.
		DecimalFormat df = new DecimalFormat("#.00");
		
		for(float i=-2; i<=1.0 ;i+=0.1) {
			System.out.println(df.format(i));
		}
		
	}

}
