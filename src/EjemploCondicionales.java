
public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Bienvenido al programa"); //Si escribimos sysout + ctrl + espacio podemos autocompletar este comando
		
		int edad = 15;
		int personas = 1;
		
		if (edad >= 18) {
			System.out.println("Usted es mayor de edad, puede ingresar");
		}
		else if (edad < 18 & personas >= 2) { // & es igual a la expresión "Y/AND"
			System.out.println("Usted es menor pero viene acompañado, así que puede ingresar");
		}
		else {
			System.out.println("Usted es menor, no tiene permitido el ingreso");
		}
		
		//Una forma de que el código de arriba quede más optimizado:
		if (edad >= 18 | personas >=2) { //Es igual a la expresión "O/OR"
			System.out.println("Usted puede ingresar");
		}
		else {
			System.out.println("Usted es menor, no tiene permitido el ingreso");
		}
	}
}
