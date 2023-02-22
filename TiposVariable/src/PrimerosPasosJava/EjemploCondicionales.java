package PrimerosPasosJava;

public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Probando condicionales");
		
		int edad=15;
		int cantidad=2;
		
		if(edad >= 18) {
			System.out.println("Puede entrar");
		}else{
			if(cantidad >=2) {
				System.out.println("Usted es menor de edad pero tiene permitido ingresar");
			}else {
				System.out.println("Usted no puede entrar");
				}
			}
	}
}
 