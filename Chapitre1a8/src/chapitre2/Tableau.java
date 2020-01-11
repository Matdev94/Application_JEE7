package chapitre2;

public class Tableau{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int [] tab1= {4,8,10};
			double [] tab2= {1.3,5.6,7.8,4.75};
			String [] tab3= {"toto", "tata"};
			char [] tab4= {'a','b','c','d'};

			int j=5, k=3;
			System.out.println(tab1[2]);
			System.out.println(tab4[0]);
			tab2[0]=79.6;
			tab1[1]--;
			System.out.println(tab1[0]);
			System.out.println(tab1[1]);
			tab4[2] +=6;
			System.out.println(tab4[2]);
			tab3[0]= "hello";
			System.out.println(tab4[j-k]);
			System.out.println(tab3[0]);
			System.out.println(tab4[4]);
			
	}

}
