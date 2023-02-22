package PrimerosPasosJava;

public class TransformandoWhileToFor {
	
	public static void main(String[] args) {
	int total = 0;
	for (int i = 0; i <= 10; i++) {
		total = total + i;
		System.out.println(i);
		}
		System.out.println("La suma con For da: " + total);
	}
}