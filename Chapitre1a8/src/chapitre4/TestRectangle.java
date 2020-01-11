package chapitre4;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 ;
		r1 = new Rectangle() ;
		r1.afficher();
		r1.translater(10, 20);
		r1.afficher();
		r1.translater(15, 25);
		r1.afficher();
		
		Rectangle r2 ;
		r2 = new Rectangle(100,150);
		r2.afficher();
		
		Rectangle r3 = new  Rectangle(5,10,25,35);
		r3.afficher();

	}

}
