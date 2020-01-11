package chapitre1;

public class Test2 {
public static void main (String [] args) {
	float pi;
	pi= 3.141592653f;//ne compile pas sans le f
	float nombre= 2;//OK
	nombre = 2.0f;//ne compile pas sans le suffixe f
	
	double division; 
	division= 0.3333333333333333333333333333d; //le suffixe d est optionel
	System.out.println(nombre); // affichage nombre
}
}
