package chapitre1;
import java.util.Scanner;
public class While2 {
public static void main (String [] args) {

Scanner sc= new Scanner(System.in);
int nb= 0;
while (nb <5) { 
//Incrémente la valeur nb jusqu a 5 et initialise a 0 
nb++;
System.out.println("nb="+nb);
}
}
}