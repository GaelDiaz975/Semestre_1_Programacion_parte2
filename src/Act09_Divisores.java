import java.util.Scanner;

public class Act09_Divisores {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ingrese un dividendo");
		
		double dividendo = sc.nextDouble();
		
		System.out.println("ingrese un divisor");
		
		double divisor = sc.nextDouble();
		
		double division = dividendo % divisor;
		
		if (division == 0) {
			
			System.out.println("su numeros son divisores");
		} else {
			
			System.out.println("sus numeros no son divisores");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
