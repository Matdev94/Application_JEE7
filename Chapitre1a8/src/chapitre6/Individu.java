package chapitre6;

public class Individu {
	
	private String nom;
	private String prenom;
	private int age;
	private static int nombreAbonnes=0;
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String nouveauprenom) {
		this.prenom = nouveauprenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nouveaunom) {
		this.nom = nouveaunom;
	}

	public Individu(String lenom, String leprenom, int lage) {
		
		this.nom=lenom; 
		this.prenom= leprenom;
		this.age= lage;
		System.out.println("Je suis le constructeur de Individu");
	}
	public void afficheIndividu( ) {
		System.out.println("Nom:"+getNom()+ "Prenom:"+prenom+"Age:"+age);
	
	}
public String toString() {
	
	return nom+prenom+age;
	
}
	
}
