package domaci;

public class Glavna {
//	Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.
//
//	Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
//
//	Putnik je covek koji poseduje novac.
//	Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
//	Odredjena svota novca moze da mu se doda i/ili oduzme, 
//	gde je potrebno vratiti indikator uspesnosti.
//
//	Autobus poseduje naziv, vozaca, cenu karte i niz putnika koji se njime voze. 
//	Naziv, cena karte i broj mesta zadaju se prilikom kreiranja. 
//	Moguce je dodati/ukloniti putnika kao i vozaca. 
//	Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 

//	Autobus ispisati u sledecem obliku:
//	Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )
	
	public static void main(String[] args) {
		Putnik p1 = new Putnik("Sinisa","Golubovic",15.2f),p2 = new Putnik("Siaisa","Golubovic",18.2f),p3 = new Putnik("Sina","Golubovic",35.2f), p4 = new Putnik("Sin","Golub",5.2f);
		Vozac v = new Vozac("Tra","Lala","Sofer");
		
		Autobus a = new Autobus("Firma Krstic", 10f, 3);
		
		a.DodajPutnika(p1);
		a.DodajPutnika(p4);
		a.DodajPutnika(p2);
		a.DodajPutnika(p3);
		
		//System.out.println(a);
		
		a.NaplatiKarte();
		
		a.setA(v);
		
		System.out.println(a);
		
		a.NaplatiKarte();
		
		System.out.println(a);
		
	}

}
