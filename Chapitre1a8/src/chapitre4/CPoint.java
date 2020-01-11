package chapitre4;

public class CPoint {

	private double x ;
	private double y;
	private int cpt ;
	
	public CPoint() {
		x=0;
		y=0;
		cpt=0;
	}
	public CPoint(int x, int y, int cpt) {
		this.x = x;
		this.y = y;
		this.cpt = cpt;
	}
	public void ajouter(CPoint p) {
		x = x + p.getX();
		y = y + p.getY() ;
		cpt++;
	}
	public boolean comparer(CPoint p) {
		if (x == p.getX() && y == p.getY())
			return true ;
		else
			return false ;
	}
	public void deplacerPoint(double dx, double dy) {
		x = x+dx ;
		y = y+dy ;
		cpt++;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public int getCpt() {
		return cpt;
	}
	

}
