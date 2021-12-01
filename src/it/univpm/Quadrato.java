package it.univpm;

public class Quadrato implements InterfacciaRitorno {

	@Override
	public double ritorno(int numero) {
		return (numero*numero);
	}
}