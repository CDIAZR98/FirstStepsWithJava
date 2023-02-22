package PrimerosPasosJava;

public class EjemploCondicionales2 {
	
	public static void main(String[] args) {
		System.out.println("Probando condicionales");
		
		int edad=18;
		int cantidadPersonas=2;
		
		boolean esPareja = cantidadPersonas>1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		if(puedeEntrar) {
			System.out.println("Puede entrar");
		}else{
			System.out.println("Usted no puede entrar");
		}
	}
}
