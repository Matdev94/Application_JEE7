package chapitre1;

public class Test1 {

	public static void main (String [] args) {
		byte temp; //déclaration d'une variable nommée temp de type byte
		temp =64;/* On affecte 64 dans la variable temp
		          Comme c'est la 1ere fois qu'on affecte une valeur dans la variable temp, 
		          il s'agit d'une initilsaisation*/
		
		
		short vitesseMax; // déclaration d'une variable nommée vitesseMax de type short
		vitesseMax= 32000; //initialisation de la variable vitesseMax
		
		// on peut initialiser une variable en même temps qu'on la déclare 
		int tempSoleil= 150000;
		System.out.println(tempSoleil); //affichage du contenu de la variable tempSoleil
		long anneeLumiere;
		anneeLumiere= 946070000000000000L; // ne compile pas sans le L
	}
}
