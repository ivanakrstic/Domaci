package domaciZad2;

import java.util.ArrayList;

public class Obdaniste {
	
	ArrayList<Dete> deca;
	
	public Obdaniste() {
		deca= new ArrayList<Dete>();
	}
	
	public ArrayList<Dete> getDeca() {
		return deca;
	}
	
	public double prosekGodina() {
		
	   double zbirGodina=0;
	   for(Dete dete: deca) {
		   zbirGodina+=dete.brojGodina;
	   }
	   double prosek= zbirGodina/ deca.size();
	   return prosek;   //moglo je da bude i int, pa da bude zaokruzena vrednost
	}

}
