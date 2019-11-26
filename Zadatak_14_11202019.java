package domaci;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_14_11202019 {

	public static void main(String[] args) {
		
			//Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom)

		// Prvo definisemo duzinu niza
				Scanner sc = new Scanner(System.in);
				int duzina;
				System.out.println("Unesite duzinu niza");
					duzina = sc.nextInt();
					
					if (duzina <= 0) System.out.print("Duzina ne moze biti negativna niti nula. ");
					if (duzina == 1) System.out.println("Nema smisla kreirati niz od jednog broja, ali ok, kako hoces");
				
				
				// Kreiracemo niz gde ce se ti clanovi ispisivati unazad 
				// pa ako su isti onda je palindrom
				int[] niz = new int[duzina];
				int[] obniz = new int[duzina];

				
				//  Broj je palindrom ako se ispisuje isto u oba smera.
				// Najlaksi nacin je da ispisemo taj niz i drugi niz koji ide unazad i da ih uporedimo
				// Unosimo brojeve u niz.
				for (int i = 0; i < duzina; i++) { 
					System.out.println("Unesite " + i + "-ti broj: ");
					int broj = sc.nextInt();
					niz[i] = broj;
					obniz[(duzina-1)-i] = broj;
					
				}

				// Ispisujemo sve clanove niza, zbog preglednosti.
				System.out.println("");
				System.out.print("Niz cine clanovi : ");
				for (int i = 0; i < duzina; i++) 
					System.out.print(niz[i] + " , ");
				
				
				System.out.println("");
				System.out.print("Niz ispisan unazad je : ");
				for (int i = 0; i < duzina; i++) 
					System.out.print(obniz[i] + " , ");
				

				
				
				// Ispisi da li je palindrom. Uporedjujemo da li su isti elementi
				System.out.println("");
				if (Arrays.equals(niz, obniz)) //if (obniz[i]==niz[i]) ne porede se ovako nizovi
					System.out.println("Jeste palindrom");
				else System.out.println("Nije palindrom");
				
				
				
				
				
				
				
				

				
				
				

				
				
				
	}

}
