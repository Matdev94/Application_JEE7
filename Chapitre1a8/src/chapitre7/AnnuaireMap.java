package chapitre7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class AnnuaireMap {

	private HashMap<String,Abonne> lesAbonnesparleNom;
	private HashMap<String,Abonne> lesAbonnesparLeTelephone;
	
	// Le constructeur d’Annuaire crée le HashMap, écrire ici le constructeur d’Annuaire
	public AnnuaireMap() {
		HashMap<String, Abonne> hashAnnuaire1 = new HashMap<String, Abonne>();
	    
	}
	// ajouter un abonne dans l'annuaire
	public void ajouterAbonne(Abonne abo1) {
		Abonne a= lesAbonnesparleNom.put(abo1.getNom(), abo1);	
		if(a!= null) {
			System.out.println("L'abonné n'as pas été ajouté");
		}
	}
	// relire l'annuaire avec affichage sur l’écran
	public void voirLesAbonnes() {
		Collection<Abonne> collectionAbonne= lesAbonnesparleNom.values();
		Iterator<Abonne> it= collectionAbonne.iterator();
		while(it.hasNext()) {
			Abonne a= it.next();
			a.afficheAbonne();
		}

	}
	// Pour rechercher un abonné par son nom
	// Retourne le numéro trouvé ou null
	public String rechercherParLeNom(String ceNom) {
		return ceNom;
	
	}
	// Pour rechercher un abonné par son numéro
	// Retourne le nom trouvé ou null
	public String rechercherParLeNumero(String ceNumero) {
		return ceNumero;

	}
	// Pour rechercher un abonné par son numéro et le supprimer
	public boolean supprimerParLeNumero(String ceNumero) {
		return false;
	
	}
	// Pour rechercher un abonné par son nom et le supprimer
	public boolean supprimerParLeNom(String ceNom) {
		return false;
	
	}
	// Pour rechercher un abonné par son nom et son prénom
	// Retourne le numéro trouvé ou null
	public String rechercherParLeNom(String ceNom, String cePrenom) {
		return cePrenom;
	
	}
	}

