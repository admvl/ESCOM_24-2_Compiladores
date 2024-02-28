import java.util.Scanner; // Scanner is in the java.util package

public class entradaTeclado {

	public static void main(String[] args) {

	// Create a Scanner object
	Scanner input = new Scanner(System.in);



	// Prompt the user to enter a radius

	System.out.print("Escribir el radio: ");

	double radio = input.nextDouble() ;


	// Compute area

	double area = radio * radio * 3.14159;


	// Display result

	System.out.println("El area del circulo de radio " +

	radio + " es " + area);

	}
}
