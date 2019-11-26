package domaci;

import java.util.Scanner;

public class Zadatak_17_11242019 {

	public static void main(String[] args) {
//		Napisati program koji ucitava niz od n celih brojeva i dve metode. 
//		Prva metoda vraca proizvod elemenata na neparnim pozicijama, 
//		a druga vraca zbir parnih elemenata niza.

	Scanner sc=new Scanner(System.in);
	
	
	System.out.println(" Koliko brojeva zelite da ucitate");
	int n=sc.nextInt();
	System.out.println(" Unesite " + n + " brojeva: ");
	int[] brojevi=new int[n];
	for (int i=0;i<brojevi.length;i++) {
		int broj = sc.nextInt();
		brojevi[i]=broj;
	}
	Zadatak_17_11242019 h3 = new Zadatak_17_11242019();
	int proiz = h3.proizvod(brojevi);
	System.out.println("Prizvod brojeva na neparnim pozicijama je: " + proiz);
	int zb = h3.zbir(brojevi);
	System.out.println("Zbir brojeva na parnim pozicijama je: " + zb);

}
int proizvod(int[] niz) {
	int proizvod =1;
	for (int i=0;i<niz.length;i+=2) {  
		proizvod*=niz[i];
	}
	return proizvod;
}

int zbir(int[] niz) {
	int zbir =0;
	for (int i=1;i<niz.length;i+=2) {  
		zbir+=niz[i];
	}
	return zbir;
	}

}
