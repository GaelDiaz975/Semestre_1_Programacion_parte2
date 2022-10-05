import java.util.Scanner;

public class Act08_GradosCelsiusAFaherenheitOKelvin {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
		
		System.out.println("Si desea convertir a FAHRENHEIT presione 1 "
			+ "\nsi desea convertir a KELVIN presione 2");
	
	 int des = sc.nextInt();
	 
	 if (des == 1) {
		 
		 System.out.println("ingresa una temperatura en CELSIUS: ");
			
			Double cen = sc.nextDouble();
			
			double fah = ( cen * 1.8 ) + 32 ;

			System.out.println("su temperatura en FAHERENHEIT ES: " + fah);
		
	} else if (des == 2) {
		
		 System.out.println("ingresa una temperatura en CELSIUS: ");
			
			Double cen = sc.nextDouble();
			
			double kel = cen + 273.15 ;

			System.out.println("su temperatura en KELVIN ES: " + kel);
		
		
	} else {
		
		System.out.println("opcion no valida");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
