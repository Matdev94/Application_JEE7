package chapitre3;

import java.util.Scanner;

public class Ex62 {

	public static int genererNombre() {
		int nb = (int)(50*Math.random());
		return nb ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int N = genererNombre() ;
		
		int n ;
		do {
			System.out.print("Nombre :");
			n = sc.nextInt();
			if (n>N)
				System.out.println("Trop grand");
			if (n<N)
				System.out.println("Trop petit");
		}while (n !=N);
		System.out.println("Gagné!");
	}
}

