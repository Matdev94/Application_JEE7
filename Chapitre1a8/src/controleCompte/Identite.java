package controleCompte;

public class Identite {

	private String nom;
	private String prenom;
	public Identite(String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
		
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
}
