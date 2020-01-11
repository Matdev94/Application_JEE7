package chapitre3;

import java.util.Scanner; // classe utilisée pour réaliser les saisies

public class Hypotenuse {
	public static void main(String[] args) {
		// Declaration des variables locales de la fonction main()
		double am, bm, hypom; // m comme main()
		Scanner sc; // déclaration d'une variable référence destinée à pointer
					// sur un objet de type
		// Scanner
		sc = new Scanner(System.in); // Création de l'objet de type classe
										// Scanner, l'opérateur new

		// renvoie une référence sur cet objet
		// appel de la fonction print() pour l'objet référencé par out
		System.out.print("--> Veuillez saisir la longueur du premier coté : ");
		am = sc.nextDouble(); // appel de la fonction nextDouble() pour l'objet
								// référencé par sc
		System.out.print("--> Veuillez saisir la longueur du second coté : ");
		bm = sc.nextDouble();
		// 1er appel de la fonction calculHypotenuse()
		hypom = calculHypotenuse(am, bm);
		System.out.println("1. Longueur de l'hypoténuse du triangle rectangle");
		System.out.println(" de cotés " + am + " et " + bm + " : " + hypom + "\n");
		// 2ème appel de la fonction calculHypotenuse()
		hypom = calculHypotenuse(am + 2.5, 7.8);
		System.out.println("2. Longueur de l'hypoténuse du triangle rectangle");
		System.out.println(" de cotés " + (am + 2.5) + " et " + 7.8 + " : " + hypom + "\n");
	}

	/*
	 * DEFINITION de la fonction membre calculHypotenuse() Fonction qui calcule
	 * la longueur de l'hypoténuse d'un triangle rectangle : - 1er paramètre :
	 * longueur du 1er coté - 2ème paramètre : longueur du second coté - valeur
	 * de retour : l'hypoténuse
	 */
	public static double calculHypotenuse(double a, double b) // entête de la
																// fonction
																// membre
	{ // début du corps de la fonction membre calculHypotenuse()
		// déclaration des variables locales de la fonction calculHypotenuse()
		double res;
		// appel de la fonction statique sqrt(). Cette fonction fait partie de
		// la classe Math
		res = Math.sqrt(a * a + b * b);
		return res; // => retour dans la fonction appelante (ici, il s'agit de
					// la fonction main())
		// en renvoyant la valeur de res
	} // fin du corps de la fonction membre calculHypotenuse()
} // fin de la définition de la classe Hypotenuse