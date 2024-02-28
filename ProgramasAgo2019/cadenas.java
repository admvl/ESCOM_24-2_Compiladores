import java.util.Scanner;

public class cadenas {

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);

	System.out.println("Escribir una cadena:");
	String a = teclado.nextLine();
	
	System.out.println("Su longitud es:" + a.length());
	}
}
