package chapitre3;

public class Rectangle extends Forme {
private int largeur ;
private int longueur ;
public Rectangle(int x, int y) {
this.largeur = x ;
this.longueur = y ;
}
public int getLargeur() {
return this.largeur ;
}
public int getLongueur() {
return this.longueur ;
}
public int surface() {
return this.longueur * this.largeur ;
}
public void affiche() {
System.out.println("rectangle" + longueur + "x" + largeur);
}
}