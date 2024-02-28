import java.util.Scanner;
public class Pets2 {
	public static void main(String[] args) 	{
		Scanner stdIn = new Scanner(System.in);
		Object obj;
		System.out.print("¿Qué tipo de mascota prefieres? \n" +
		"Escribir d para perro or c para gatos:");
		if (stdIn.next().equals("d")) {
			obj = new Dog();
		}
		else {
			obj = new Cat();
		}
		
		if (obj instanceof Dog) {
			System.out.println("Menear la cola");
		}
	} // Fin main
} // Fin de clase Pets2




