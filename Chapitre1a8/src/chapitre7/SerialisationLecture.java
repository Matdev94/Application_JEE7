package chapitre7;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;



public class SerialisationLecture
{
public static void main(String [] args) {
String filename = "abonne1";
if(args.length > 0) {
filename = args[0];
}
Abonne abo = null;
FileInputStream fis = null;
ObjectInputStream in = null;
try {
try {
fis = new FileInputStream(filename);
in = new ObjectInputStream(fis);
abo = (Abonne)in.readObject();
abo.afficheAbonne() ;
}
finally {
in.close();
}
}
catch(IOException eio) {
eio.printStackTrace();
}
catch(ClassNotFoundException ex) {
ex.printStackTrace();

}
}
}