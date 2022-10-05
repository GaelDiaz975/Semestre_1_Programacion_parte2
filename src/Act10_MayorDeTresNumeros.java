import java.util.Scanner;

public class Act10_MayorDeTresNumeros {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ingresa un numero: ");
		
		Double num1 = sc.nextDouble();
		
		System.out.println("ingresa un numero: ");
		
		Double num2 = sc.nextDouble();
		
		
		
		if (num1 > num2) {
			
			System.out.println("ingresa un numero: ");
           double num3 = sc.nextDouble();
           
           if (num1 > num3) {
        	   
        	   System.out.println("\nel numero " + num1 + " es mayor");
			
		} else {
			
			System.out.println("\nel numero " + num3 + " es mayor");
		}
		} else {
			
			System.out.println("ingrese un numero: ");
			double num3 = sc.nextDouble();
       if (num2 > num3) {
	
	   System.out.println("\nel numero " + num2 + " es mayor");
	
       } else {
	
     	System.out.println("\nel numero " + num3 + " es mayor");
         }			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
