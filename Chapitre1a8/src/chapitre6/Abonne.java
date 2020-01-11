package chapitre6;

public class Abonne extends Individu {
	private String telephone;
	protected static int nombreAbonnes=0;
	
	public Abonne(String nom, String prenom, int age,String telephone) {
		super (nom, prenom, age);
		this.telephone= telephone;
		System.out.println("Je suis le constructeur de Abonne");
		nombreAbonnes++;
		
		
	}
    public void afficheAbonne() {
    	afficheIndividu();
    	System.out.println("Nom:"+getNom()+ "Prenom:"+getPrenom()+"Age:"+getAge()+"Telephone"+telephone);
    }
	public String getTelephone() {
		return this.telephone;
	}
	public String toString() {
		return this.telephone;
		
	}
	public static int getNombreAbonnes() {
		return nombreAbonnes;
	}
	public static void setNombreAbonnes(int nombreAbonnes) {
		Abonne.nombreAbonnes = nombreAbonnes;
	}

}
