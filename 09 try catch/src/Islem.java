
public class Islem {

	public static void main(String[] args) {
		
		int a,b,c;
		try {
		 a=5;
		 b=0;
		 c=a/b;
		}catch (Exception e) {
			System.out.println("Bir hata olu�tu =>"+e.toString());
		}finally {
			System.out.println("Program sonland�");
		}
	}
}
