package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		for(int elements: tabell) {
		
		System.out.println(elements);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

	String streng = ("\"[");
	
	for (int i = 0; i < tabell.length; i++) {
		
		if (i != tabell.length - 1) {
		
			streng += (tabell[i] + ",");
		
		} else {
			streng += (tabell[i]);
		}
		
	}
	streng += ("]\"");
		
	System.out.println(streng);
	
	return streng;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for (int value : tabell) { 
			sum += value;
		}
		System.out.println(sum);
		
		return sum; 		
	} 
	
/**		
		int sum = 0;
		
		int k = 0;
		
		while (k <= (tabell.length - 1)) {
		sum = sum + tabell[k];
		k++;		
	}
		System.out.println(sum);
		
		return sum;
		
		
		int sum = 0;
		
		for (int i = 0; i <= tabell.length; i++) {
			
			sum += tabell[i];
		}
		
		System.out.println(sum);
		
		return sum;
			**/


	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		int i = 0;
		
		while (i < tabell.length && (!finnes)) {
			
			if (tabell[i] == tall) {
				finnes = true;
				
			}
			
			i++;
		}
		
		System.out.println(finnes);
		
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		if (tabell == null) {
			
			return -1;
		}
		
		int i = 0;
		
		while (i < tabell.length) {
			
			if (tabell[i] == tall) {
				
				return i;
			}
			else {
				
				i += 1;		
			}
		}
		
		return -1;
	}

	// f) IKKE FERDIG
	public static int[] reverser(int[] tabell) {
	
		for (int i = 0; i < tabell.length / 2; i++) {
			
			int temp = tabell[i];
			tabell[i] = tabell[tabell.length - i - 1];
			tabell[tabell.length - i - 1] = temp;
			
		}
		
		for (int j = 0; j < tabell.length; j++) {
			System.out.println(tabell[j]);
		}
		
	return tabell;
	}
		

	// g)
	public static boolean erSortert(int[] tabell) {
		
		for(int i = 1; i < tabell.length; i++) {
			
			if (tabell[i - 1] > tabell[i])
				return false;
		}
		
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int length = tabell1.length + tabell2.length;
		
		int[] result = new int [length];
		
		int i = 0;
		
		for (int element : tabell1) {
			result[i] = element;
			i++;
		}
		
		for (int element : tabell2) {
			result[i] = element;
			i++;
		}
	
		tilStreng(result);
	
		return result;
	}
	
}
