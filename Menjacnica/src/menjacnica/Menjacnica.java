package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
	private LinkedList<Valuta> valute=new LinkedList<Valuta>();

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Menjacnica > valute:" + valute;
	}

	@Override
	public void dodajKurs(String valuta, GregorianCalendar datum, double prodajni, double srednji, double kupovni) {
		Kurs k=new Kurs();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
		for (int i = 0; i < valute.size(); i++) {
			if(valuta!=null && valute.get(i).getNaziv().equals(valuta)) {
				valute.get(i).setKursevi(k);
				
			}
		}
		
	}

	@Override
	public void obrisiKurs(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKurs(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
