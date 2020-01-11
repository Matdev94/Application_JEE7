package chapitre8;
import java.io.Console;

public class Console2 {
public static void main (String argv[]) {
Console c = System.console() ;
String s = c.readLine() ;
c.printf("lu : " + s + "\n") ;
}
}


