import java.util.Scanner;

public class Act05_CalificacionesPromedio {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);


	System.out.println("ingrese una calificacion: ");
	
	int cal1 = sc.nextInt();
	
    System.out.println("ingrese una calificacion: ");
	
	int cal2 = sc.nextInt();
	
    System.out.println("ingrese una calificacion: ");
	
	int cal3 = sc.nextInt();
	
    System.out.println("ingrese una calificacion: ");
	
	int cal4 = sc.nextInt();
	
    System.out.println("ingrese una calificacion: ");
	
	int cal5 = sc.nextInt();
	
	int calP = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;
	
	
	if (calP < 70) {
		
		System.out.println("\npromedio reprobatorio" + " (" + calP + ")");
		
		
	
}	else {
	
	System.out.println("\npromedio aprobatorio" + " (" + calP + ")"); 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	} 

}