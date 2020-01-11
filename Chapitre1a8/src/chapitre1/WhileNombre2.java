package chapitre1;

import java.util.Scanner;
public class WhileNombre2{
public static void main (String [] args) {
Scanner sc= new Scanner (System.in);
int nb;
do 
{
	System.out.println("Entrez un nombre entre 0 et 10 inlcus:");

 nb= sc.nextInt();
	
    if(nb<10)
		System.out.println("Trop petit"); 
	
		if(nb>20)
			System.out.println("Trop grand"); 

	
}
while ( nb <10 || nb>20);
}
}
