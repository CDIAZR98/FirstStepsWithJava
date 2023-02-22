package PrimerosPasosJava;

public class EjemploCiclos2 {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			total = total + contador;
			System.out.println(contador);
			contador++;
		}
		System.out.println("La suma con Do While da: " + total);

		total = 0;

		for (int i = 0; i <= 10; i++) {
			total = total + i;
			System.out.println(i);
		}
		System.out.println("La suma con For da: " + total);
	}
}