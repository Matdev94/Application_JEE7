package chapitre1;
import java.util.Scanner; 
public class TestSwitch{
public static void main (String []args) {
int nb;

System.out.println("Saisir un entier:");
Scanner sc= new Scanner(System.in);
nb= sc.nextInt();
switch (nb) {
	case 1 :
	System.out.println("nb vaut 1");
	break;
	case 2 : 
	System.out.println("nb vaut 2");
	break;
	case 3 :
	System.out.println("nb vaut 3");
	break;
	default: System.out.println("nb est différent des valeurs testées dans les case");
}
}
}