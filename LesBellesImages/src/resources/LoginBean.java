package resources;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import javamodeles.Client;

public class LoginBean {

	private Client client ;
	private Integer code ;
	public LoginBean() {
	client = new Client() ;

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
	public String validationClient() {
	return "bienvenue" ;
	}
	public String enregistrerClient() {
	return "bienvenue" ;
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