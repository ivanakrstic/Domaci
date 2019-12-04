package domaci;

public class Putnik extends Covek {
	private float novac;
	
	public Putnik(String ime, String prezime, float n) {
		super(ime, prezime);
		
		this.novac = n;
	}

	public float getNovac() {
		return novac;
	}
	
	public boolean dodajNovac(float n) {
		novac += n;
		return true;
	}
	
	public boolean oduzmiNovac(float n) {
		if(this.novac < n)
			return false;
		else {
			this.novac -= n;
			return true;
		}
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString()).append(" [").append(this.novac).append(']');
		return s.toString();
	}
	
	
	
	
}
