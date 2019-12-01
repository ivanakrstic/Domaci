package ucionica;

import java.util.ArrayList;

public class Laptop {

	
		//Laptop poseduje listu polaznika koji ga koriste i 
	//marku koji se zadaju prilikom kreiranja. Marka moze samo da se dohvati.
	//Lista polaznika koji koriste laptop moze da se prosiri.
	//Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	
	private ArrayList<Polaznik> polaznici;
	private String marka;

	public Laptop(String marka) {
		polaznici= new ArrayList<Polaznik>(); ///obavezno!!! u suprotnom ne mozes da koristis listu
		this.marka= marka;
	}
	public String getMarka() {
		return marka;
	}
	
	public ArrayList<Polaznik> getPolaznici() {
		return polaznici;
	}
	
//	public void prosiriListu (Polaznik polaznik) {
//		polaznici.add(polaznik);
//	}
	
	@Override
	public String toString() {
		
		 String polazniciIspis="";
		 for (Polaznik polaznik : polaznici) { //p1, p2,p3, p4,...
			 polazniciIspis+=polaznik.ispis()+",";
		 } //IVANA_KRSTIC{123}, MILICA_MIJ{456} ...

		return marka+"{"+polazniciIspis+"}";  //LENOVO{IVANA_KRSTIC{123}, MILICA_MIJ{456}}
	}


}