package chapitre8;

import java.io.Console;

public class TestConsole {
public static void main (String argv[]) {
Console c = System.console() ;
String login = c.readLine("Taper votre login: ");
c.printf("login: "+login +"\n") ;
}
}