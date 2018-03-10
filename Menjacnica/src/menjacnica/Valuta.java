package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursevi=new LinkedList<Kurs>();
	
	@Override
	public String toString() {
		return "Naziv valute:" + naziv + ", skraceni naziv valute:" + skraceniNaziv + ", kursevi:" + kursevi+"\n";
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null)
			throw new RuntimeException("Morate uneti naziv!");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv==null || skraceniNaziv.length()!=3)
			throw new RuntimeException("Morate uneti skraceni naziv duzine 3 karaktera!");		
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(Kurs kurs) {
		if(kurs==null || kursevi.contains(kurs)) throw new RuntimeException("Morate uneti kurs, ili kurs vec postoji");
		this.kursevi.add(kurs);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valuta))
			return false;
		Valuta other = (Valuta) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}
}