package domaci;

import java.util.Scanner;

public class Zadatak_15_11242019 {

	public static void main(String[] args) {
//		 Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu).
//		Napisati zasebno 2 metode
//		Prva metoda ispisuje elemente niza koji su deljivi sa 3
//		Druga metoda ispisuje elemente niza koji su deljivi sa 5
//
//		ili
//
//		Korisnik ucitava niz od N elemenata niza, kao i neki broj K za deljivost. 
//		Napisati metodu koja ispisuje elemente niza deljive brojem K.
		
		
			Zadatak_15_11242019 h = new Zadatak_15_11242019();
			int k=17;
			h.deljiviSaK(k);
		}
		
		int[] ucitajNiz() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ucitati broj clanova niza");
			int[] niz = new int[6];
			for(int i=0; i<niz.length; i++) {
				int n = sc.nextInt();
				niz[i]=n;
			}
//			for(int i=0; i<niz.length; i++) {
//				System.out.print(niz[i]+", ");
//			}
//			System.out.println();
			return niz;
		}

		// Prva metoda ispisuje elemente niza koji su deljivi sa 3
		void deljiviSaTri() {
			int[] niz= ucitajNiz();
			System.out.println("Brojevi iz niza deljivi sa tri su");
			for(int i=0; i<niz.length; i++) {
				if(niz[i] % 3==0) {
					System.out.print(niz[i]+"|");
				}
			}
		}
		
		//Druga metoda ispisuje elemente niza koji su deljivi sa 5
		void deljiviSaPet() {
			int[] niz= ucitajNiz();
			System.out.println("Brojevi iz niza deljivi sa pet su");
			for(int i=0; i<niz.length; i++) {
				if(niz[i] % 5==0) {
					System.out.print(niz[i]+"|");
				}
			}
		}
		//Korisnik ucitava niz od N elemenata niza, kao i neki broj K za deljivost. Napisati metodu koja ispisuje elemente niza deljive brojem K.
		void deljiviSaK(int k) {
			int[] niz= ucitajNiz();
			System.out.println("Brojevi iz niza deljivi sa brojem K su");
			for(int i=0; i<niz.length; i++) {
				if(niz[i] % k==0) {
					System.out.print(niz[i]+"|");
				}
			}


	}

}
