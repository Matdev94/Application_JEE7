package chapitre4;

public class Rectangle {
	private float largeur;
	private float longueur;
	// Position du centre du rectangle (X,Y) dans le plan.
	private int x;
	private int y;
	private float angle;
	public Rectangle(float l, float L, int X, int Y){
		longueur = L ;
		largeur = l ;
		x = X ;
		y = Y ;
	}
	public Rectangle(float l, float L){
		largeur = l ;
		longueur = L ;
	}
	public Rectangle() {
		largeur=10;
		longueur = 20;
	}
	/* Les opérations = méthodes = fonctions membres */
	public int compareSurface(Rectangle r) {
		float s1 = largeur * longueur ;
		float s2 = r.largeur * r.longueur ;
		if (s1 > s2)
			return 1 ;
		if (s1==s2)
			return 0 ;
		return -1;
	}
	void tourner(float a) {
		/* A coder */ }

	void agrandir(float a) {
		if (a > 1) {
			largeur  = largeur * a ;
			longueur = longueur * a ;
		}
	}

	void reduire(float a) {
		if (a < 1) {
			largeur  = largeur * a ;
			longueur = longueur * a ;
		}
	}

	void translater(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	void afficher() {
		System.out.println("Ma longueur= " + longueur + " et ma largeur= " + largeur);
		System.out.println("Je suis en X = " + x + " et en Y = " + y);
	}
}
