package chapitre7;

import java.util.HashMap;

import chapitre7.Service;
public class Serveur extends NomIp {

	private String machine;
	private HashMap<Integer,Service> lesServices;
	public Serveur (String machine, String nomIp,String adresse) {
		super(nomIp,adresse);
	this.machine=machine;
	}
	public boolean desactiveService (int port) {   
		return false;
		
	}
	public void activeTout() {
		
	}
	public void desactiveTout() {
		
	}
	public HashMap<Integer,Service> getLesServices() {
		return lesServices;
	}
	public void setLesServices(HashMap<Integer,Service> lesServices) {
		this.lesServices = lesServices;
	}
}

