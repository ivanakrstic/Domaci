package domaci;

public class Covek {
	//Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se dodeljuju prilikom kreiranja objekta. 
	//Svi podaci mogu da se dohvate, ali ne i postave.
	
	private String ime;
	private String prezime;
	private int id;
	private static int GId = 0;// da li ovo treba da bude static
	public Covek(String ime, String prezime) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.id = GId++;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getId() {
		return id;
	}
	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(ime).append(' ').append(prezime).append(" id=").append(id);
		return s.toString();
	}
	
	
}
