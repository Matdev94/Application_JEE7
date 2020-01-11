package chapitre6;

public abstract class FormeGeometrique {
	
double posX, posY;

void deplacer(double x,double y) {
posX=x;
posY=y;
}
void afficherPosition() {
System.out.println("position : ("+posX+","+posY+")");
}

public  int estPlusGrandeQue(FormeGeometrique s)
{
	if(surface()> s.surface()) {
		System.out.println("Ce cercle est plus que ce rectangle");
		return 1;
	}
	else if (surface()<s.surface()) {
		System.out.println("Ce cercle est plus petit que ce rectangle");
		return -1;
	}
	else
		System.out.println("Les 2 formes ont la meme surface");
	
	return 0;

}
protected abstract double surface();

protected abstract double perimetre();
}

