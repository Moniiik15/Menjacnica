package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String valuta, GregorianCalendar datum, double prodajni, double srednji, double kupovni);
	public void obrisiKurs(String valuta, GregorianCalendar datum);
	public Kurs vratiKurs(String valuta, GregorianCalendar datum);
	
}