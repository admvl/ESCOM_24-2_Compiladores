import java.util.Scanner;

public class listaNombres {
	private String nombre;
	private int edad;
	Scanner input = new Scanner(System.in);

	public void setNombre(String nombre) {
		nombre = input.nextString();
		
	}

	public int setEdad(int edad) {
		edad = input.nextInt();
		
	}

	

	public String getNombre() {
		
		System.out.println("Escribe el nombre");
	}

	public int getEdad() {
		
		System.out.println("Escribir la edad");
	}

	public static void main(String[] args) {
		listaNombres p;
		int count = 0;
		

		while (count < 5) {
	
		listaNombres p = new listaNombres();
		p.getnombre();
		p.setEdad();
		p.getEdad();
		
		count++;

		}
	}
}
