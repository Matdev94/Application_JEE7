package chapitre3;

import java.util.Scanner;

public class Ex61bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		double longueur = saisieDimension(sc,"Longueur :") ;
		double largeur = saisieDimension(sc,"Largeur :") ;
		
		double surf = calculAireRectangle(longueur,largeur);
		afficheValeur(surf,"Surface: ");
		
		double peri = calculPerimetre(longueur,largeur);
		afficheValeur(peri,"Périmétre: ");
		
	}
public static void afficheValeur(double valeur, String message ){
		System.out.println(message+valeur);
	}
public static double calculPerimetre(double L, double l){
	double peri = 2*(L+l);
	return peri ;
}
public static double saisieDimension(Scanner clavier, String message){
	System.out.print(message);
	double dim = clavier.nextDouble();
	return dim ;
	}

public static double calculAireRectangle(double L, double l){
	double aire = L * l ;
	return aire ;
	}

}
