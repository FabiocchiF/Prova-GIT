package it.univpm;

public class Cubo implements InterfacciaRitorno{

	@Override
	public double ritorno(int numero) {
		return (numero*numero*numero);
	}
}