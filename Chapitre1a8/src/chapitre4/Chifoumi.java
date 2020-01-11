package chapitre4;

import java.util.Scanner;

public class Chifoumi {
	private int choixMachine ;
	private int choixJoueur ;
	private Scanner clavier ;
	public Chifoumi() {
		clavier = new Scanner(System.in) ;
	}
	public String conversion(int chx) {
		if (chx==0)
			return "Caillou" ;
		if (chx==1)
			return "Papier" ;
		return "Ciseaux";
	}
	public void afficheChoix() {
		System.out.println("La machine a choisi "+conversion(choixMachine));
		System.out.println("Vous avez choisi "+conversion(choixJoueur));
	}
	public void getChoixJoueur() {
		System.out.println("Donnez votre choix");
		System.out.println("\t0 pour caillou, 1 pour papier, 2 pour ciseaux:");
		int n = clavier.nextInt() ;
		choixJoueur = n ;
	}
	public void getChoixMachine() {
		//int n = (int) Math.round(2*Math.random()) ;
		int n = (int) (3*Math.random()) ;
		choixMachine = n ;
	}
	public int resultatJeu() {
		int gagne ;
		if ( (choixJoueur==0 && choixMachine==2) || 
				(choixJoueur==1 && choixMachine==0) || 
				(choixJoueur==2 && choixMachine==1))
					gagne=2 ;
		else {
			if (choixJoueur==choixMachine)
				gagne=0 ;
			else gagne=1 ;
		}
		if (gagne==0)
			System.out.println("Egalité");
		if (gagne==2)
			System.out.println("Vous avez gagné!");
		if (gagne==1)
			System.out.println("Vous avez perdu!");
		afficheChoix();
		return gagne ;
	}
	
}
