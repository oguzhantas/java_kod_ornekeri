abstract class Bisiklet{  
  
	abstract void pedalCevir(); //mutlaka ezilecek
	abstract void zilCal(); //mutlaka ezilecek
	
}  

class  dagBisikleti extends Bisiklet{  
	void pedalCevir(){
		System.out.println("�al���yor...");
	} 
	
	void zilCal() {
		System.out.println("Zil �al���yor...");
	}

	public static void main(String args[]){  
			dagBisikleti bisiklet1 = new dagBisikleti();  
			bisiklet1.pedalCevir();
			bisiklet1.zilCal();
	}  
}  
