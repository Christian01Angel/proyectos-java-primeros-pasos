
public class TipoVariable {
	public static void main(String[] args) {
		
		int edad; // Desde [(-2)**(32)] hasta [(2)**(32)]-1
		
		edad = 29;
		
		double peso = 72.5;
		
		System.out.println(edad);
		System.out.println(peso);
		
		int pesoEntero = (int) peso; //Casteamos el decima peso para que se convierta a entero
		
		double edadDecimal = edad;
		System.out.println(edadDecimal);
		
		System.out.println(pesoEntero);
		
		String frase = "69";
		System.out.println("Número en formato Str: " + frase);
		
		int fraseEntero = Integer.parseInt(frase); //Esto es un parseo
		System.out.println("Esto es un número Int: " + fraseEntero);
		
		long numeroGrande = 122222222222222222L;  // Desde [(-2)**(63)] hasta [(2)**(63)]-1
		
		short numeroPequeno = 16316; // Desde [(-2)**(15)] hasta [(2)**(15)]-1
		
		byte numeroAunMasPequeno = 127; // Desde [(-2)**(7)]+1 hasta [(2)**(7)]-1 O sea desde -127 hasta 128 
		
		float numeroDecimalPequeno = 134.5F;
	}

}
