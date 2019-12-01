package domaciZad2;

public class Dete {

//	Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
//	Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih godina(ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo prosecne godine za to dvoje) .

	String ime;
	String prezime;
	int brojGodina;
	int brojKlikera;  //0
	
	public Dete(String ime, String prezime, int brojGodina, int brojKlikera) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.brojGodina = brojGodina;
		this.brojKlikera = brojKlikera;
	}
	
	public void dodajKlikere(int brojKlik) {
		brojKlikera+=brojKlik;
	}
	
	public void oduzmiKlikere(int brojKlik) {
		brojKlikera-=brojKlik;
	}
	
	public void ispisiBrojKlikera() {
		System.out.println(brojKlikera);
	}
	
	
	
	
	
	
}
