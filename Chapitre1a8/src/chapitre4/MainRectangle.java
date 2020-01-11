package chapitre4;

import java.util.Scanner;

public class MainRectangle {
	public static Rectangle creerRectangle() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Longueur :");
		float L = sc.nextFloat() ;
		System.out.println("Largeur :");
		float l = sc.nextFloat() ;
		System.out.println("Abcisse :");
		int abs = sc.nextInt(); 
		System.out.println("Ordonnée :");
		int ord = sc.nextInt(); 
		Rectangle r = new Rectangle(l,L,abs,ord);
		return r ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r0 = creerRectangle() ;
		r0.afficher();
		
		Rectangle r1 ;
		r1 = new Rectangle() ;
		r1.afficher();
		r1.translater(10, 20);
		r1.afficher();
		r1.translater(15, 25);
		r1.afficher();
		
		Rectangle r2 ;
		r2 = new Rectangle(100,150);
		r2.afficher();
		
		Rectangle r3 = new  Rectangle(5,10,25,35);
		r3.afficher();
		r3.agrandir(2);
		r3.afficher();
		
		System.out.println("Comparaison : "+r1.compareSurface(r0));
		System.out.println("Comparaison : "+r1.compareSurface(r2));
		System.out.println("Comparaison : "+r1.compareSurface(r3));
		System.out.println("Comparaison : "+r1.compareSurface(r1));
	}
}
