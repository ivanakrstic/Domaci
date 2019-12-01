package ucionica;

public class Glavna {

	public static void main(String[] args) {
		
		Polaznik p1 = new Polaznik("Ivana", "Krstic");
		p1.setIdentifikacioniBroj("123");
		Polaznik p2 = new Polaznik("Jelena", "Markovic");
		p2.setIdentifikacioniBroj("456");
		Polaznik p3 = new Polaznik("Nevena", "Kostic");
		p3.setIdentifikacioniBroj("789");
		
		Laptop laptop = new Laptop("LENOVO");
		laptop.getPolaznici().add(p1);
		laptop.getPolaznici().add(p2);
		laptop.getPolaznici().add(p3);
		
		System.out.println(laptop.toString());
	

	}

}
