package it.univpm;

public class Main {

	public static void main(String[] args) {
		Numero numero = new Numero();
		Quadrato quad = new Quadrato();
		Cubo cubo = new Cubo();
		System.out.println("Numero: " + numero.ritorno(5) + " Quadrato: " + quad.ritorno(5) + " Cubo: " + cubo.ritorno(5));
	}
}