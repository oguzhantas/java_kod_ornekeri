package whileOrnek1;

public class whileOrnek1 {

	public static void main(String[] args) {

		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if(i==5) break;
		}//while
		System.out.println("While'dan ��k�ld�");
		
		for(i=1;i<=10;i++) {
			if(i==5) break;
			System.out.println(i);
		}
		System.out.println("For'dan ��k�ld�");
		
	}//public main

}//public class
