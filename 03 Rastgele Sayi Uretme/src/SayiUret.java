import java.util.Random;

public class SayiUret {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		//1 ile 49 aras�nda 6 say� �retiniz
		for(int i=1;i<=6;i++) {
			int s1= rand.nextInt(49)+1;
			System.out.println(s1);
		}
		
		
	}

}
