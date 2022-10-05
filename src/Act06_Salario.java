import java.util.Scanner;

public class Act06_Salario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ingrese sus dias trabajados: ");
		
		int dias = sc.nextInt();
		
		System.out.println("ingrese pago por hora: ");
		
		double precioHora = sc.nextDouble();
		
		System.out.println("ingrese dias extra: ");
		
		int diasExtra = sc.nextInt();
		
       int diasExtraPago;
		
		if (diasExtra >= 5) {
			
        	 diasExtraPago = diasExtra * 3;
		}		else {
			
			 diasExtraPago = diasExtra * 2;
		}
		
		
		double salarioBruto = ((dias + diasExtraPago) * 8) * precioHora;
		
		double salarioNeto;
		
		if (salarioBruto < 20000) {
			
			salarioNeto = salarioBruto - ( (salarioBruto * 14) / 100) ;
			System.out.println("su salario con un ispt de 14% es: " + salarioNeto);
		} else {
			
			salarioNeto = salarioBruto - ( (salarioBruto * 16) / 100) ;
			System.out.println("su salario con un ispt de 16% es: " + salarioNeto);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
