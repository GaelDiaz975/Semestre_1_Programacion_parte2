
import java.util.Scanner;

public class Act04_ConvertirGradosFahrenheitACentigrados {
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("ingresa una temperatura en Fahrenheit: ");
	
	Double fah = sc.nextDouble();
	
	double cen = ( fah - 32 ) / 1.8 ;
	
	if (cen <= 0) {
		
		System.out.println("la temperatura: " + cen + " es congelante");
		
	} else {
		
		System.out.println("la temperatura: " + cen + " es normal");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
