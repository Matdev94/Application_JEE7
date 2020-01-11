package chapitre4;

public class TestCpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPoint p1 = new CPoint() ;
		double x = p1.getX();
		double y = p1.getY() ;
		int cpt = p1.getCpt() ;
		System.out.println("x="+x+" y="+y+" compteur="+cpt);
		p1.deplacerPoint(5, 7);
		x = p1.getX();
		y = p1.getY() ;
		cpt = p1.getCpt() ;
		System.out.println("x="+x+" y="+y+" compteur="+cpt);
		p1.deplacerPoint(10, 12);
		x = p1.getX();
		y = p1.getY() ;
		cpt = p1.getCpt() ;
		System.out.println("x="+x+" y="+y+" compteur="+cpt);
		
		CPoint p2 = new CPoint(15,19,0);
		System.out.println(p1.comparer(p2));
		
		p2.deplacerPoint(2, 1);
		System.out.println(p1.comparer(p2));
		p1.ajouter(p2);
		x = p1.getX();
		y = p1.getY() ;
		cpt = p1.getCpt() ;
		System.out.println("x="+x+" y="+y+" compteur="+cpt);
	}
}
