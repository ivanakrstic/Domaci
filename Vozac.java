package domaci;

public class Vozac extends Covek {
	private String zvanje;
	public Vozac(String ime, String prezime, String zva) {
		super(ime, prezime);

		this.zvanje = zva;
	}
	
	public String getZvanje() {
		return zvanje;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString()).append(' ').append(zvanje);
		return s.toString();
	}
	
	
}
