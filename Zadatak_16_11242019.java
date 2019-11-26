package domaci;

import java.util.Scanner;

public class Zadatak_16_11242019 {

	public static void main(String[] args) {
//		Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve metode(u mainu). 
//		Prva metoda vraca proizvod unetih brojeva. 
//		Druga metoda ispisuje najmanji od unesenih brojeva.
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitati broj clanova niza");
		double[] niz = new double[3];
		for(int i=0; i<niz.length; i++) {
			double n = sc.nextDouble();
			niz[i]=n;
		}
		Zadatak_16_11242019 h2= new Zadatak_16_11242019();
		double proizvod= h2.metoda1(niz);
		System.out.println("Proizvod brojeva je: "+proizvod);
		h2.metoda2(niz);
		
	}
	
	//Prva metoda vraca proizvod unetih brojeva. 
	double metoda1(double[] n) {
		double proizvod=1;
		for(int i=0; i<n.length;i++) {
			proizvod*=n[i];
		}
		return proizvod;
	}
	
	// Druga metoda ispisuje najmanji od unesenih brojeva.
	void metoda2(double[] n) {
		
		double min = n[0];
		for (int i = 0; i < n.length; i++) {

			if (min > n[i]) { 
				min = n[i];
			}
			
		}
		System.out.println("Najmanji broj u nizu je " + min);


	}

}
