package ucionica;

public class Polaznik {

	// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	// Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
	// prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
	// u obliku: IME_PREZIME{ID}.
	private String ime;
	private String prezime;
	private String identifikacioniBroj;

	public Polaznik(String ime, String prezime) {

		this.ime = ime;
		this.prezime = prezime;

	}

	public String getIdentifikacioniBroj() {
		return identifikacioniBroj;
	}

	public void setIdentifikacioniBroj(String identifikacioniBroj) {
		this.identifikacioniBroj = identifikacioniBroj;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String ispis() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + "{" + identifikacioniBroj.toUpperCase() + "}";

	}
	
	@Override
	public String toString() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + "{" + identifikacioniBroj.toUpperCase() + "}";

	}
	

}
