
public class EjemploCaracteres {
	public static void main(String[] args) {
		
		char caracter = 'f'; // Solo se acepta un caracter y se define entre comillas simples
		System.out.println(caracter);
		
		caracter = 75;  // Letra K (mayuscula) del codigo ASCII
		System.out.println(caracter);
		
		caracter = 500 + 350;
		System.out.println(caracter);
		
		char segundoCaracter = (char) (caracter - 200);
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2023";
		System.out.println(palabra);
	}
}
