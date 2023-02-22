package PrimerosPasosJava;

public class EjercicioFactoriales {

	public static void main(String[] args) {
		
		int factorial=1;
		for (int numero = 1; numero <= 10; numero++) {
			factorial *=numero;
			System.out.println("Factorial de " + numero + " = " + factorial);
		}
	}
}
