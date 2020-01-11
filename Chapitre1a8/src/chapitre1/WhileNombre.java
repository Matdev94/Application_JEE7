package chapitre1;
import java.util.Scanner;

public class WhileNombre{
	
	
public static void main (String [] args) {

Scanner sc= new Scanner(System.in);

int nbre=0;

do {
	
	System.out.println("Entrez un nombre entre 0 et 3:");
	 nbre= sc.nextInt();

}

while (nbre > 3 && nbre <0);

}

}
