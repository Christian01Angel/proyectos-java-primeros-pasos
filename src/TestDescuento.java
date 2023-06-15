
public class TestDescuento {
	public static void main(String[] args) {
		double valorCompra = 250.0;
		double descuento;
		
		
		if(valorCompra<100) {
			System.out.println("Usted no aplica para ningun descuento");
		}
		else if (valorCompra>=100 & valorCompra<200) {
			descuento = valorCompra * 10 / 100;
			valorCompra = valorCompra - descuento;
			System.out.println("Tiene un descuento del 10%, el total a pagar es de: " + valorCompra);
		}
		else if(valorCompra>=200 & valorCompra<300) {
			descuento = valorCompra * 15 / 100;
			valorCompra = valorCompra - descuento;
			System.out.println("Tiene un descuento del 15%, el total a pagar es de: " + valorCompra);
		}
		else{
			descuento = valorCompra * 20 / 100;
			valorCompra = valorCompra - descuento;
			System.out.println("Tiene un descuento del 20%, el total a pagar es de: " + valorCompra);
		}
	}
}
