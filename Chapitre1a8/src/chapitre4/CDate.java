package chapitre4;

import java.time.LocalDate;

public class CDate {
	private int jour ;
	private int mois ;
	private int annee ;
	public CDate() {
		LocalDate date = LocalDate.now() ;
		jour = date.getDayOfMonth() ;
		mois = date.getMonthValue() ;
		annee = date.getYear();
	}
	int compareCDate(CDate date){
		if (annee > date.annee)
			return 1 ;
		if (annee < date.annee)
			return -1 ;
		/// années identiques
		if (mois > date.mois)
			return 1 ;
		if (mois < date.mois)
			return -1 ;
		/// mois identiques
		if (jour > date.jour)
			return 1 ;
		if (jour < date.jour)
			return -1 ;
		return 0 ;
	}
	int [] getDate() {
		int []d = new int[3] ;
		d[0] = jour;
		d[1] = mois ;
		d[2] = annee ;
		return d ;
	}
	String getDateTexte() {
		String d = String.valueOf(jour)+"/"+String.valueOf(mois)+"/"+String.valueOf(annee);
		return d;
	}
	public int getNombreJoursEcoules() {
		int lesmois[] = {31,28,31,30,31,30,31,31,30,31,30,31} ;
		if (testAnneeBissextile(annee)==true)
			lesmois[1]=29 ;
		int somme = 0 ;
		for (int i=0; i<mois-1; i++)
			somme = somme+lesmois[i] ;
		somme = somme+jour ;
		return somme;
	}
	public boolean changeDate(int jour, int mois, int annee) {
		if (jour<1 || jour >31 || mois<1 || mois>12 || annee<1582 )
			return false ;
		int lesmois[] = {31,28,31,30,31,30,31,31,30,31,30,31} ;
		if (testAnneeBissextile(annee)==true)
			lesmois[1]=29 ;
		if (jour > lesmois[mois-1])
			return false ;
		this.jour = jour ;
		this.mois = mois ;
		this.annee = annee ;
		return true ;
	}
	public boolean changeDate(String date){
		String d[] = date.split("/");
		if (d.length !=3)
			return false ;
		int j = Integer.parseInt(d[0]);
		int m = Integer.parseInt(d[1]);
		int a = Integer.parseInt(d[2]);
		boolean r = changeDate(j,m,a);
		return r ;
	}
	public boolean testAnneeBissextile(int annee){
		if ( (annee%4==0 && annee%100 !=0) || annee%400==0)
			return true ;
		else return false ;
	}
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	public int getAnnee() {
		return annee;
	}

}
