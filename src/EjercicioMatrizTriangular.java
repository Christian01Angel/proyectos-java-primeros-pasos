
public class EjercicioMatrizTriangular {
	public static void main(String[] args) {
		for(int fila = 1; fila<=10; fila++) {
			for(int columna = 1; columna <=10 ; columna ++) {
				if (columna > fila ) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}