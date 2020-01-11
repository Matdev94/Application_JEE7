package chapitre7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationEcriture
{
public static void main(String [] args)
{
String filename = "abonne1";
if(args.length > 0) {
filename = args[0];
}
@SuppressWarnings("null")
Abonne abo = new Abonne("Pierrot","Jean",25,"0078912349");
FileOutputStream fos = null;
ObjectOutputStream out = null;
try {
try{
fos = new FileOutputStream(filename);
out = new ObjectOutputStream(fos);
out.writeObject(abo);
}
finally {
out.close();
}
}
catch(IOException ex) {
ex.printStackTrace();
}
}
}