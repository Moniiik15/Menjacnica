package menjacnica;

import java.util.LinkedList;

public class Menjacnica {
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

	
}
