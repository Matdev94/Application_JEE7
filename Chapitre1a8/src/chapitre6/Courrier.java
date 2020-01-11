package chapitre6;

public class Courrier {
	protected float timbre;
	public boolean isVitesse() {
		return vitesse;
	}

	public void setVitesse(boolean vitesse) {
		this.vitesse = vitesse;
	}

	public void setTimbre(float timbre) {
		this.timbre = timbre;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	protected boolean vitesse; 
	protected int volume;
	
	public Courrier () {
		timbre= 50;
		vitesse= false;
		volume= 1;
		
	}
	
	public void afficher() {
		
	}
    public void affranchir() {
    	
    }
    public float getTimbre() {
    	
		return timbre;
    	
    }
    public int getVolume () {
    	return volume;
    }
}
