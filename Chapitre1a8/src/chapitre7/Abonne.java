package chapitre7;

import java.io.Serializable;

public class Abonne extends Individu implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1371619637438173649L;
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
		return telephone;
	}
	public String toString() {
		return telephone;
		
	}
	public static int getNombreAbonnes() {
		return nombreAbonnes;
	}
	public static void setNombreAbonnes(int nombreAbonnes) {
		Abonne.nombreAbonnes = nombreAbonnes;
	}

}

