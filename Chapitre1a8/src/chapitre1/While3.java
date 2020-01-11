package chapitre1;
import java.util.Scanner;
public class While3 {
public static void main (String [] args) {

Scanner sc= new Scanner(System.in);
int nb= 0;
do { 
System.out.println("Saisir un entier 1 pour sortir");
nb= sc.nextInt();
}
while (nb!=1);
}
}
