package chapitre2;

import java.util.Scanner; 
public class TestEntier{
public static void main (String []args) { 

int nb1, nb2, nb3, nb4, nb5, nb6, nb7, nb8 ;
 

Scanner sc= new Scanner (System.in); 
System.out.println( "Veuillez saisir 3 entiers:") ;
nb1= sc.nextInt(); 
nb2= sc.nextInt();
nb3= sc.nextInt();

/*nb4= nb1+nb2+nb3;
System.out.println("Résultat de la somme des 3 entiers:");
System.out.println(nb4);
*/
nb5= nb1*nb2*nb3;
System.out.println("Résultat du produit des 3 entiers: " );
System.out.println(nb5);
nb6= nb1-nb2;
System.out.println("Résultat de la différence du 1er moins du 2e:" );
System.out.println(nb6);
nb7= nb3/nb2;
System.out.println("Résultat du quotient  du 3e par le 2e:" );
System.out.println(nb7);
nb8= nb3%nb2;
System.out.println("Résultat du  reste de la division du 3e par le 2e:");
System.out.println(nb8);
}
}