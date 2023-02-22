package PrimerosPasosJava;

public class EjercicioTasaIf {
	public static void main(String[] args) {

		double salary = 3300.0;

		boolean case1 = salary > 1900.0 && salary < 2800.0;
		boolean case2 = salary > 2800.0 && salary < 3751.0;
		boolean case3 = salary > 3751.0 && salary < 4664.0;

		if (case1) {
			System.out.println("El impuesto sobre la enta (IR) es de 7.5% y puede deducir 142");
		}
		if (case2) {
			System.out.println("El impuesto sobre la enta (IR) es de 15% y puede deducir 350");
		}
		if (case3) {
			System.out.println("El impuesto sobre la enta (IR) es de 22.5% y puede deducir 636");
		} else {
			System.out.println("Su salario se encuentra fuera de rangos");
		}

	}

}
