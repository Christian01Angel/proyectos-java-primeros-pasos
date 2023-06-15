import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println("Bienvendio a la calculadora de factorial.");
		
		int factorial = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el número que desea factorizar: ");
		int numeroAFactorizar = teclado.nextInt();
		
		for(int contador = 1; contador<=numeroAFactorizar; contador++) {
			factorial *= contador;
		}
		
		System.out.println("El factorial de " + numeroAFactorizar + " es: " + factorial);
		teclado.close();
	}
}
