package no.hvl.dat100.lab6.matriser;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {

	public static void main(String[] args) {
		
		int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] b = { {10,11,12}, {13,14,15}, {16,17,18} };
		
		assertTrue(Matriser.erLik(a, a));
		System.out.println(Matriser.erLik(a, a));

		assertFalse(Matriser.erLik(a, b));
		System.out.println(Matriser.erLik(a, b));
	}

}
