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
		for (int i = 0; i < valute.size() ; i++) {
			if(valuta!=null && valute.get(i).getNaziv().equals(valuta)) {
				Kurs k=new Kurs();
				k.setDatum(datum);
				k.setKupovni(kupovni);
				k.setProdajni(prodajni);
				k.setSrednji(srednji);
				valute.get(i).setKursevi(k);
				
			}
		}
		
	}

	@Override
	public void obrisiKurs(String valuta, GregorianCalendar datum) {
		for ( int i = 0; i < valute.size(); i++) {
			if(valuta!=null && valute.get(i).getNaziv().equals(valuta)) {
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						valute.get(i).getKursevi().remove(j);
						
					}
				}
				
			}
		}
		
	}

	@Override
	public Kurs vratiKurs(String valuta, GregorianCalendar datum) {
		for ( int i = 0; i < valute.size(); i++) {
			if(valuta!=null && valute.get(i).getNaziv().equals(valuta)) {
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
					return valute.get(i).getKursevi().get(j); 
				}
			}
		}
	}
	
		throw new RuntimeException("Trazeni kurs ne postoji!");
}

	
}
