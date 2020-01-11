package chapitre8;
import java.io.*;
public class Bonjour2

{
public static void main(String[] args)
{
BufferedReader clavier= new BufferedReader(new InputStreamReader(System.in));
String Saisies;
int n,fois=0;
System.out.println("Combien de fois par jour dites-vous Bonjour ?");
try {
Saisies=clavier.readLine();
fois= Integer.parseInt(Saisies);
}
catch(IOException e) {
System.out.println("Erreur IO");
System.exit(0);
}
for(n=0;n<fois;n++) {
System.out.print("Bonjour numero ");
System.out.println(n+1);
}
}
}