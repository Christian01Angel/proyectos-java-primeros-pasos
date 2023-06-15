
public class EjemploWhile {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <=10 ) {
			total += contador;
			System.out.println("Contador ahora es igual a " + contador);
			contador ++;
		}
		System.out.println("El total de la suma de los numeros del 1 al 10 es igual a: " + total);
	}
}
