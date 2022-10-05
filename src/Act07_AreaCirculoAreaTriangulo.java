import java.util.Scanner;

public class Act07_AreaCirculoAreaTriangulo {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Si desea la area de un TRIANGULO presione 1 "
			+ "\nsi desea la area de un CIRCULO presione 2");
		
	int des = sc.nextInt();
	
	if (des == 1) {
		
		System.out.println("ingrese base de su triangulo: ");
		
		double base = sc.nextDouble();
		
		System.out.println("ingrese altura de su triangulo: ");
		
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2; 
		
		System.out.println("su area es: " + area);
		
	}  else if (des == 2) {
		
		System.out.println("ingrese el radio de su circulo: ");
		
		double radio = sc.nextDouble();
		
		double area = radio * Math.PI;
		
		System.out.println("su area es: " + area);
		
	} else {

		System.out.println("opcion no valida");
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
