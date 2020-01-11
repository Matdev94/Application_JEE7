package chapitre6;


public class Rectangle extends FormeGeometrique {
double posY,posX;
public Rectangle(double x, double y) {
posX=x; posY=y;
}
public double surface() {
return (posX*posY);
}
public double perimetre() {
return 2*(posX +posY);
}
}