package domaciZad2;

public class TestObdaniste {

	public static void main(String[] args) {
		Dete d1 = new Dete("M","M", 5, 17);
		Dete d2 = new Dete("V","V", 1, 10);
		Dete d3 = new Dete("S","S", 4, 9);
		Dete d4 = new Dete("E","E", 5, 12);
		
		Obdaniste obdaniste = new Obdaniste();
		obdaniste.deca.add(d1);
		obdaniste.deca.add(d2);
		obdaniste.deca.add(d3);
		obdaniste.deca.add(d4);
		
		System.out.println(obdaniste.prosekGodina());
		d1.dodajKlikere(7);
		System.out.println(d1.brojKlikera);
		d4.oduzmiKlikere(5);
		System.out.println(d4.brojKlikera);

	}

}
