package domaci;

import java.util.Scanner;

public class Zadatak_13_11202019 {

	public static void main(String[] args) {
		//Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		
		// Prvo definisemo duzinu niza
				Scanner sc = new Scanner(System.in);
				int duzina;
				System.out.println("Unesite duzinu niza");
					duzina = sc.nextInt();
					
					if (duzina <= 0) System.out.print("Duzina ne moze biti negativna niti nula. ");
					if (duzina == 1) System.out.println("Nema smisla kreirati niz od jednog broja, ali ok, kako hoces");
				 
				
				int[] niz = new int[duzina];
				int p = 1;
				
				// Istovremeno i unosimo broj u niz i ispitujemo da li je taj uneti broj veci od indeksa
				for (int i = 0; i < duzina; i++) {
					System.out.print("Unesite " + (i + 1) + ". broj: ");
					niz[i] = sc.nextInt();
					if (niz[i] > i) 
						p *= niz[i];
					}
				for (int i = 0; i < duzina; i++) 
					System.out.print(niz[i] + " ");
				System.out.println("");
				System.out.println("Proizvod svih elemenata niza je : " + p);
	}

}
