package chapitre4;

public class JouerChifoumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chifoumi jeu = new Chifoumi() ;
		
		// On joue 3 points
		int joueur = 0 ;
		int machine = 0;
		do {
			jeu.getChoixJoueur();
			jeu.getChoixMachine();
			int r =jeu.resultatJeu();
			if (r==1)
				machine++ ;
			if (r==2)
				joueur++;
		} while (joueur<3 && machine<3);
		if (joueur==3)
			System.out.println("Vous avez gagné 3 points");
		else 
			System.out.println("La machine a gagné 3 points");
	}
}
