package chapitre3;

public  abstract class AbstractForme {
	
	private int origine_x ;
	private int origine_y ;
	
	public AbstractForme() {
	this.origine_x = 0 ;
	this.origine_y = 0 ;
	}
	public int getOrigineX() {
	return this.origine_x ;
	}
	public int getOrigineY() {
	return this.origine_y ;
	}
	public void setOrigineX(int x) {
	this.origine_x = x ;
	}
	public void setOrigineY(int y) {
	this.origine_y = y ;
	}
	public abstract int surface();
	
	public abstract void affiche();
	}

