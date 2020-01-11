package chapitre7;

import java.io.*;
import java.util.Scanner;


public class Test01{
public static String lireClavier() throws IOException
{
BufferedReader clavier = new BufferedReader( new InputStreamReader(System.in));
String texte=clavier.readLine();
return texte ;
}
public static void main( String[] args) throws IOException
{
/*
String name;
System.out.println("Entrer le nom");
Scanner sc= new Scanner (System.in);
name= sc.toString();
System.out.println("Votre nom est:"+name);
*/


Individu pers1= new Individu("Aimar" ,"Jean", 25);
//Abonne abo1= new Abonne(null, null, 0, null);
//pers1.affiche();
System.out.println(pers1.toString());
//abo1.toString();

}

}