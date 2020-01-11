package chapitre8;

import java.io.*;


public class Bonjour {
	int nombre ;
	BufferedReader clavier= new BufferedReader(new InputStreamReader(System.in));
	public void lire() {
		boolean saisie ;
		String Saisies;
		int fois=0;
		do
		{
			saisie = true ; //saisie passe à false si l'utilisateur ne tape pas un entier
			System.out.println("Combien de fois par jour dites-vous bonjour ?");
			try {
				Saisies=clavier.readLine();
				fois= Integer.parseInt(Saisies);
				System.out.println("Saisie correcte");
			}
			/*catch (NumberFormatException e){
				System.out.println("Erreur de saisie");
				System.out.println(e);
				saisie = false ;
			}*/
			catch(IOException e) {
				System.out.println("Erreur IO");
				System.exit(0);
			}
			System.out.println("Avant fin du test sur saisie");
		} while (saisie == false);
		nombre = fois ;
	}
	public void afficher() {
		for(int n=0;n<nombre;n++) {
			System.out.print("bonjour numero ");
			System.out.println(n+1);
		}
	}
	public static void main(String[] args) {
		Bonjour b = new Bonjour ();
		b.lire();
		b.afficher();
	}
}