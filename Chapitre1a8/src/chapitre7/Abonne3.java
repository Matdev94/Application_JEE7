package chapitre7;

public class Abonne3 extends Abonne implements Affichable {

	public Abonne3(String nom, String prenom, int age, String telephone) {
		super(nom, prenom, age, telephone);
		// TODO Auto-generated constructor stub
	}
//////////La fonction affichetout() de l’interface affichable est codée ici.
public void affichetout()
{
System.out.println("Nom: "+getNom()+ " Prénom: "+getPrenom()+"\n");
System.out.println("Téléphone : "+getTelephone()+"\n");
}
/////////////////////////////////////////////////////////////////////////////////////////////////
}
