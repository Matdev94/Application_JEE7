package chapitre6;

public class Sac {

	private int places= 100;
	private int occupees= 0;
	private Courrier []leCourrier;;


	public Sac() {
		
		Courrier unsac= new Courrier();


	}
	public  boolean remplirSac( Courrier leCourrier) {

		for (int i= 0; i<leCourrier.volume;i++) {
			
		}


		return true;

	}

	public float affranchir() {



		return 0;

	}

	public boolean testSacPlein(Courrier leCourrier) {

//		if (leCourrier)
		return false;


	}
	public Courrier [] getLeCourrier() {
		return leCourrier;
	}
	public void setLeCourrier(Courrier [] leCourrier) {
		this.leCourrier = leCourrier;
	}
	public int getOccupees() {
		return occupees;
	}
	public void setOccupees(int occupees) {
		this.occupees = occupees;
	}
	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
}
