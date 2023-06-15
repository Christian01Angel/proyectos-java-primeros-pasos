
public class VaryableYMemoria {
	public static void main(String[] args) {
		int numero1 = 15;
		int numero2 = 9;
		
		System.out.println(numero2);
		
		numero2 = numero1; //Al haver esto, solo se guarda el valor de la variable, no se almacena la referencia en memoria
		System.out.println(numero2);
		
		numero1 = 75; //Entonces al hacer esto, la variable numero2 sigue valiendo 15, no se va a modificar junto a la variable numero1
		System.out.println(numero2);
	}
}
