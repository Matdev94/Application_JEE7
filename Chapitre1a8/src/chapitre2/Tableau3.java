package chapitre2;

public class Tableau3{
	
public static void main(String []args) {
	int [] tab1= {4,8,10};
    double [] tab2= {1.3,5.6,7.8,4.75};
    String [] tab3= {"toto", "tata"};
    char [] tab4= {'a','b','c','d'};
	int i; 
	System.out.println("Affichage de tous les éléments du tab1:");
	
	for(i=0; i<tab1.length; i++)
		
System.out.println("\tValeur àl'indice:"+i+ ":"+ tab1[i]);

System.out.println(); // saute une ligne
System.out.println("Valeur de i:" +i); 
System.out.println("Modification des 3 derniers élements du tableau tab2:");

for (i= tab2.length-3; i<tab2.length;i++){
	tab2[i]= 2*i+0.5;
System.out.println("Affichage de tous les éléments du tableau tab2:");
}
for ( i=0; i<tab2.length; i++){
	System.out.println("\tValeur à l'indice" +i+ ":"+tab2[i]);

}
}
}