package domaci;

public class Autobus {
	private String ime;
	private float cenaKarte;
	private int BrojMesta;
	
	private Vozac a;
	
	private Putnik []niz;
	private int i;// broj sedista
	
	public Autobus(String ime, float cenaKarte, int brojMesta) {
		this.ime = ime;
		this.cenaKarte = cenaKarte;
		this.BrojMesta = brojMesta;
		this.niz = new Putnik[brojMesta];
		this.i = 0;
		this.a = null;
	}

	public Vozac getA() {
		return a;
	}

	public void setA(Vozac a) {
		this.a = a;
	}

	public String getIme() {
		return ime;
	}

	public float getCenaKarte() {
		return cenaKarte;
	}

	public int getBrojMesta() {
		
		return BrojMesta;
	}

	public int getI() {
		return i;
	}
	
	public boolean UkloniVozaca() {
		if(a == null)//ako nema vozaca
			return false;
		else {
			a = null;
			return true;
		}
	}
	
	public boolean DodajPutnika(Putnik x) {
		if(this.i == this.BrojMesta)
			return false;
		else {
			niz[i]=x;
			i++;
			return true;
		}
	}
	
	
	public boolean ObrisiPutnika(Putnik x) {
		int j = 0;
		while(j < i && niz[j].getId() != x.getId()) j++;
		
		if (j == i)
			return false;
		else {
			i--;
			niz[j] = niz[i];
			return true;
		}
	}
	
	
	public boolean NaplatiKarte() {//
		if(a == null) {
			return false;
		}
		else {
			for(int j = 0; j < this.i; j++) {
				if(!niz[j].oduzmiNovac(this.cenaKarte)) {//ako mu uspesno oduzme novac scve je ok, a ako ne izbacujemo ga iz niza busa
					this.ObrisiPutnika(niz[j]);
					j--;//posto mi metoda obrisi putnika stavlja putnika sa poslednje zauzetog mesat u nizu na mesto izbacenog, hocemo da na m j u sledecoj iteraciji ima istu vrednost kao i u ovoj da bi ovaj putnik koji je ubacen na mesto izbacenog putnika isto bio primoran da plati kartu
				}
			}
			return true;
		}
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(this.ime).append("(").append(a.toString()).append(" - ");
		
		for(int j = 0; j < i; j++)
			s.append(niz[j].toString()).append(", ");
		
		int ind = s.lastIndexOf(", ");
		s.delete(ind, s.length());
		
		s.append(")\n");
		
		
		return s.toString();
	}
}
