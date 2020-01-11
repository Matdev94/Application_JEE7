package chapitre6;

public class TestForme {

	
	public static void main (String [] args) {
    
    Rectangle rectangle= new Rectangle(6, 15);
    
	Cercle cercle= new Cercle(5);
	System.out.println("le rayon du cercle"	+cercle.surface());
	
	System.out.println("le périmètre du cercle est " +cercle.perimetre());
	
	System.out.println("le gagant est" +cercle.estPlusGrandeQue(rectangle));
	
		
	}
}
