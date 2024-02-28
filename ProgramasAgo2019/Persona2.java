import java.util.Scanner;


public class Persona2 {

	private String nombre;
	private int edad;

	public void setName(String nombre) {

	this.nombre = nombre;

	} // Fin setName

	public void setEdad(int edad) {

	this.edad = edad;

	} // Fin setEdad

	public String getName() {

	return this.nombre;

	} // Fin getName

	public int getEdad() {

	return this.edad;

	} // Fin getEdad

	
	public static void main(String[] args) {
		
		int cuenta = 0;
		Scanner input = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		while(cuenta < 5) {
		Persona1 persona1 = new Persona1();
		Persona1 persona2 = new Persona1();
				
		System.out.println("Escribir el nombre:");
		String nombre1 = teclado.nextLine();
		persona1.setName(nombre1);

		System.out.println("Escribir la edad:");
		int edad1 = input.nextInt();
		persona2.setEdad(edad1);

		
		System.out.println("El nombre es:");
		System.out.println(persona1.getName());

		System.out.println("La edad es:");
		System.out.println(persona2.getEdad());

		
		cuenta++;
		}
	} // Fin main

} // Fin de clase Person
