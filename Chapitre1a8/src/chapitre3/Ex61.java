package chapitre3;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		double longueur = saisieLongueur(sc) ;
		double largeur = saisieLargeur(sc) ;
		
		double surf = calculAireRectangle(longueur,largeur);
		afficheAire(surf);
		
		double peri = calculPerimetre(longueur,largeur);
		affichePerimetre(peri);
		
	}
public static void affichePerimetre(double per){
		System.out.println("Périmétre du rectangle : "+per);
	}
public static double calculPerimetre(double L, double l){
	double peri = 2*(L+l);
	return peri ;
}
public static double saisieLongueur(Scanner clavier){
	System.out.print("Longueur : ");
	double L = clavier.nextDouble();
	return L ;
	}
public static double saisieLargeur(Scanner clavier){
	System.out.print("Largeur : ");
	double l = clavier.nextDouble();
	return l ;
	}
public static double calculAireRectangle(double L, double l){
	double aire = L * l ;
	return aire ;
	}
public static void afficheAire(double aire){
	System.out.println("Aire du rectangle : "+aire);
	}
}
