package chapitre6;


//Un exemple de classe dérivée de FormeGeometrique :
public class Cercle extends FormeGeometrique {
double rayon;


public Cercle( double r) {
this.rayon=r;
}
public double surface() {
return Math.PI*Math.pow(rayon,2);
}
public double perimetre() {
return 2*rayon*Math.PI;
}


}