package chapitre1;
import java.util.Scanner;
public class While {
public static void main (String [] args) {

Scanner sc= new Scanner(System.in);
int nb= 1;
while (nb!=1) { 
System.out.println( "Saisir un entier, 1 pour sortir:");
nb = sc.nextInt(); 
}
}
}