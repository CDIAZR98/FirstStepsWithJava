package PrimerosPasosJava;

public class TiposVariable {
	
	public static void main (String[] args) {
		System.out.println("Hola Mundo");
		
		String nombre = "Cristian";
		int edad = 24;
		System.out.println("Mi nombre es: " + nombre + " y mi edad es: " + edad + " años");
		
		double salario = 1250.50;
		System.out.println(salario);
		
		double variable1 =230.89;
		int variable1Entero = (int) variable1; // Forzar una variable (Cast)
		System.out.println(variable1Entero);
		
		//Tipos de datos:
		//int para enteros no muy grandes 
		//double para números reales 
		//long para numeros muy grandes se debe poner "L" al final del dato para identificarlo 
		//Short para numeros pequeños 
		//byte numero aun mas pequeño
		//float soporta numeros decimales pequeños, es necesario agregar "F" al final del dato para identificación
		//String cadena de caracteres
		
		
	}
}