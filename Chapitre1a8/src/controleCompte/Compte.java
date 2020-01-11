package controleCompte;

public class Compte extends Identite {

	
	private String login;
	
	private String motDePasse;
	
	public Compte(String nom,String prenom, String login1, String motdePasse1) {
		super(nom,prenom);
		this.login=login1;
	}
	
	public String getLogin() {
		return login;
	}
	
	public boolean verifierMotDePasse(String motDePasse1) {
		Compte c1=new Compte(null, null, null, motDePasse1);
		boolean vmp= c1.equals(motDePasse);
		if(vmp==true) {
			return true;
		}else 
			return false;
		
	}
	public boolean modifierMDP() {
		/*if(verifierMotDePasse(motDePasse)==false ) {
		return false;
		}else 
			*/
			return true;
	}
	public boolean verifierCompte(Compte compte) {
		Compte c1= new Compte(login, login, login, login);
		if (c1==compte) {
		return true;
	}
		else 
			return false;
	}
}
