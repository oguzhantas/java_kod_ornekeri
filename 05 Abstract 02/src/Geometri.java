//�zet s�n�f� tan�ml�yoruz
abstract class Sekil{  
	abstract void ciz();  //mutlaka bu metod alt s�n�flarda olacak	
}  

class Kare extends Sekil{  
	void ciz(){System.out.println("Kare �iz.");}  
}  
class Daire extends Sekil{  
	void ciz(){System.out.println("Daire �iz.");}  
}

class Dikdortgen extends Sekil{
	void ciz() { System.out.println("Dikd�rtgen �iz");}
}

class Geometri{  
	public static void main(String args[]){  
		Sekil s=new Daire();  
		s.ciz();  
		
		Dikdortgen dikd = new Dikdortgen();
		dikd.ciz();
		
		Kare kr = new Kare();
		kr.ciz();
	}  
} 

