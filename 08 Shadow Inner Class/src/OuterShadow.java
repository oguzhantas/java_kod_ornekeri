
public class OuterShadow {
	   private static String adi = "O�uzhan";

	    public class InnerShadow {

	        private static String adi = "Yavuzhan";

	        public static void main(String[] args) {
	        	  System.out.println(adi);
	              System.out.println(OuterShadow.adi);
	        }
	    }
	
}
