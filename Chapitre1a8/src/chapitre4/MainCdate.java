package chapitre4;

public class MainCdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDate d = new CDate() ;
		System.out.println(d.getJour()+"-"+d.getMois()+"-"+d.getAnnee());
		System.out.println("2000 :"+d.testAnneeBissextile(2000)); //true
		System.out.println("2001 :"+d.testAnneeBissextile(2001)); //false
		System.out.println("2004 :"+d.testAnneeBissextile(2004)); //true  
		System.out.println("2100 :"+d.testAnneeBissextile(2100)); //false
		System.out.println("2016 :"+d.testAnneeBissextile(d.getAnnee()));  //true
		System.out.println(d.changeDate(29, 2, 2004));
		System.out.println(d.getJour()+"-"+d.getMois()+"-"+d.getAnnee());
		System.out.println(d.changeDate(29, 2, 2005));
		System.out.println(d.getJour()+"-"+d.getMois()+"-"+d.getAnnee());
		System.out.println(d.changeDate(0, 2, 2004));
		System.out.println(d.getJour()+"-"+d.getMois()+"-"+d.getAnnee());
		System.out.println(d.changeDate(20, 13, 2004));
		System.out.println(d.getJour()+"-"+d.getMois()+"-"+d.getAnnee());
		System.out.println(); ;
		System.out.println(d.changeDate("10/5/2010"));
		System.out.println(d.getJour()+"-"+d.getMois()+"-"+d.getAnnee());
		System.out.println(d.changeDate("29/2/2010"));
		System.out.println(d.getJour()+"-"+d.getMois()+"-"+d.getAnnee());
		//System.out.println(d.changeDate("29/2/201p"));
		System.out.println(d.getNombreJoursEcoules());
		CDate d1 = new CDate() ;
		d1.changeDate("9/5/2010");
		System.out.println(d.compareCDate(d1)); //1
		d1.changeDate("10/5/2010");
		System.out.println(d.compareCDate(d1)); //0
		d1.changeDate("11/5/2010");
		System.out.println(d.compareCDate(d1)); //-1
	}
}
