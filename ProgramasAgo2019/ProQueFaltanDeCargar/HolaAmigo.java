import java.util.Scanner;

public class HolaAmigo{

	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);
		String name;
		System.out.print("Escribir su nombre: ");
		name = stdIn.nextLine();
		System.out.println("Hola " + name + "!");
	} // Fin main
} // Fin class HolaAmigo
