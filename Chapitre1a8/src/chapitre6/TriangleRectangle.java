package chapitre6;


public class TriangleRectangle extends FormeGeometrique {
double H,L,a;
public TriangleRectangle(double h, double l,double a ) {
this.H=h;
this.L=l;
this.a=a;

}
public double surface() {
return (H*L)/2;
}
public double perimetre() {

	return Math.sqrt(Math.pow(L,2)+(Math.pow(H, 2)));
}
}