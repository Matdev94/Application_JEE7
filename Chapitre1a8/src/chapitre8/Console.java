package chapitre8;


public class Console {
public static void main (String argv[]) {
java.io.Console c = System.console() ;
String s = c.readLine() ;
c.printf("lu : " + s + "\n") ;
}
}