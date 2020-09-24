package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			
			for (int x : rad) {
				System.out.print(x + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) { // \n kommer foran i stedet for bak
		
		String streng = " ";
		
		for (int i = 0; i < matrise.length; i++) {
			
			streng += "\\n";
			
			for (int j = 0; j < matrise.length; j++) {
		
				streng += matrise[i][j] + " ";
				
			}
		}
		System.out.println(streng);
		
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int [matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			
			for(int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean like = true;
		
	 	int radA = a.length;
	 	int kolonneA = a[0].length;
	 	
	 	int radB = b.length;
	 	int kolonneB = b[0].length;
	 	
	 	if (radA != radB || kolonneA != kolonneB) {
	 		like = false;
		}	
	 	
	 	else {
	 		for (int i = 0; i < radA; i++) {
	 			for (int j = 0; j < kolonneA; j++) {
	 				
	 				if (a[i][j] != b[i][j]) {
	 					like = false;
	 				}
	 			}		
	 		}
	 	}
	
	return like;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
