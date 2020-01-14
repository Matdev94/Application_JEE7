package resources;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import ejb.CalculBons;
import ejb.EjbClientLocal;
import model.Client;

public class LoginBean {

	private Client client ;
	private Integer code ;
	
	
	@EJB
	EjbClientLocal ejbclient;
	
	@EJB
	CalculBons calculbons;
	
	public LoginBean() {
	client = new Client() ;

	}
	
	public String enregistrerClient() {
		if (ejbclient.rechercherUnClient(client)==null){
		calculbons.genererBons(5);
		client.setBons(calculbons.getNbbons());
		ejbclient.persistClient(client);
		return "bienvenue" ;
		}
		else return "erreur" ;
		}
	public Client getClient() {
	return client;
	}
	public void setClient(Client client) {
	this.client = client;
	}
	public Integer getCode() {
	return code;
	}
	public void setCode(Integer code) {
	this.code = code;
	}
	/*Explications
Si le client (nom,motdepasse) est identifié:
Alors
Calcul du nombre de bons obtenu à cette visite à partir du code entré.
Lecture du nombre de bons déjà obtenu par le client.
Calcul du nouveau nombre de bons (nombre actuel de bons).
Mise à jour du nombre de bons du client.
Modification du client dans la table.
Affichage de la page "bienvenue.xtml".
Sinon
Affichage de la page "enregistrement.xtml".
Finsi
	 * 
	 * 
	 * 
	 * */
	
	public String validationClient() {
		if ((client=ejbclient.identifierUnClient(client))!=null) {
		calculbons.genererBons(code);
		int bons = client.getBons();
		calculbons.calculerBons(bons);
		client.setBons(calculbons.getNbbons());
		ejbclient.mergeClient(client);
		return "bienvenue" ;
		}
		else return "enregistrement" ;
		}
	
	
	
	
	public void interdireAdmin(FacesContext context, UIComponent toValidate,
			Object arg2) throws ValidatorException {
			// TODO Auto-generated method stub
			String nom = (String) arg2;
			if (nom.matches("(^\\s*admin\\s*$).*") == true) {
			((UIInput) (toValidate)).setValid(false);
			FacesMessage message = new FacesMessage("Connexion interdite en admin ");
			context.addMessage(toValidate.getClientId(context), message);
			}
			}
	}