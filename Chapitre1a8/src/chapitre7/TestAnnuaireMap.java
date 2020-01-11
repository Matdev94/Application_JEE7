package chapitre7;

public class TestAnnuaireMap {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Abonne a1 = new Abonne("Dupond","Jean",25,"0123456789");
			Abonne a2 = new Abonne("Durand","Jean",25,"1234567890");
			Abonne a3 = new Abonne("Benarfa","Miloud",25,"2345678901");
			Abonne a4 = new Abonne("Djokovich","Raquette",25,"3456789012");
			
			Annuaire monannuaire = new Annuaire() ;
			monannuaire.ajouterAbonne(a4);
			monannuaire.ajouterAbonne(a3);
			monannuaire.ajouterAbonne(a2);
			monannuaire.ajouterAbonne(a1);
			
			monannuaire.voirLesAbonnes();
			
			System.out.println(monannuaire.rechercherParLeNumero("0123456789"));
			//System.out.println(monannuaire.rechercherParLeNumero("Durando"));
			
		}
	}
