package chapitre3;

public class FormeMain {

	public static void main(String[] args) {
	
		/*
		// TODO Auto-generated method stub

		System.out.println( "pi="+ Math.PI);
		System.out.println("90°="+ Math.toRadians(90));
	
	*/
	
	Forme[] tableau = new Forme[4];
	
	tableau[0] = new Rectangle(10,20);
	tableau[2] = new Rectangle(5,30);
	tableau[3] = new Carre(10);
	
	for (int i = 0 ; i < tableau.length ; i++) {
		
		if (tableau[i] instanceof Forme)
			
		System.out.println("element" + i + " est une forme");
		
		
		          if (tableau[i] instanceof Rectangle)
			 
		       System.out.println("element " + i + " est un rectangle");
	 	
	                  	if (tableau[i] instanceof Carre)
			
			
		               System.out.println("element " + i + " est un carré");
		}
	
	
	}
	

}
