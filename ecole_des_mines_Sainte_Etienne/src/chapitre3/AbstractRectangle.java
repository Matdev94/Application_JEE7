package chapitre3;

public class AbstractRectangle extends AbstractForme {
private int longueur;
private int largeur;
private int surface;
	
	public AbstractRectangle (int longueur, int largeur,int surface) {
		super();
		this.largeur= largeur;
		this.longueur= longueur;
		this.surface=surface;
		
	}
	@Override
	public int surface() {

		// TODO Auto-generated method stub
		return (longueur*largeur);
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println("longueur:"+longueur+"largeur:"+largeur);
		
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}

}
