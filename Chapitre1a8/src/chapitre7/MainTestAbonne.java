package chapitre7;



import chapitre7.Abonne;

public class MainTestAbonne{
public static void main(String[] args) {
Abonne a1, a2 , a3, a4 ;
System.out.println("Nombre d'abonnés: "+Abonne.nombreAbonnes);
a1 = new Abonne("Topar","Jean",50,"0303020101");
a1.afficheAbonne();
System.out.println("Nombre d'abonnés: "+Abonne.nombreAbonnes);
a2 = new Abonne("Zouzou","Rachid",23,"06050401");
System.out.println("Nombre d'abonnés: "+Abonne.nombreAbonnes);
a3 = new Abonne("Boudamba","Roger",25,"0609080704");
System.out.println("Nombre d'abonnés: "+Abonne.nombreAbonnes);
a4 = new Abonne("Suchet","Malika",42,"0603020104");
//System.out.println("Nombre d'abonnés: "+super().a4+Abonne.nombreAbonnes);

}

}