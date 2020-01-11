package chapitre3;


import java.util.Scanner;

public class Ex63 {

	public static boolean controleDate(int jour, int mois){
		int lesmois[] = {31,29,31,30,31,30,31,31,30,31,30,31} ;
		boolean ok ;
		ok = (mois>=1 && mois<=12 && jour>0 && jour<=lesmois[mois-1]);
		return ok ;
	}
	public static int getNbJourDebutAn(int jour, int mois){
		int lesmois[] = {31,29,31,30,31,30,31,31,30,31,30,31} ;
		int nbjours = 0 ;
		for (int i=0; i<mois-1;i++)
			nbjours = nbjours+lesmois[i] ;
		nbjours = nbjours+jour ;
		return nbjours ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	ANNEE 2016
		int lesmois[] = {31,29,31,30,31,30,31,31,30,31,30,31} ;
		
		Scanner sc = new Scanner(System.in);
		int jour, mois ;
		do {
			System.out.println("Jour : ");
			jour = sc.nextInt() ;
			System.out.println("Mois :");
			mois = sc.nextInt() ;
		} while (controleDate(jour,mois)==false);
		
		System.out.println("Dates OK");
		System.out.println("Nombre de jours : "+getNbJourDebutAn(jour,mois));
	}
}
