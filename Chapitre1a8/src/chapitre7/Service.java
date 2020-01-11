package chapitre7;

public class Service {
	private int port;
	private boolean actif;
	
	
	public int getPort() {
		return port;
	}
	
	public boolean getActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public Service(int port,boolean actif) {
		this.port=port;
		this.actif=actif;
		
	}
	

}
