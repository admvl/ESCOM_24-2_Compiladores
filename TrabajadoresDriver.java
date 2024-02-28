class Trabajadores {
    String nombre;
    int numeroEmpleado;
    int sueldo;

    public Trabajadores(String nombre, int numeroEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.sueldo = sueldo;
    }
}

class JefesDepartamento extends Trabajadores{
    String nombreDepartamento;

    public JefesDepartamento(String nombre, int numeroEmpleado, int sueldo, String nombreDepartamento) {
        super(nombre, numeroEmpleado, sueldo);
        this.nombreDepartamento = nombreDepartamento;
    }    

}

class Ingenieros extends Trabajadores{
    String nombreArea;

    public Ingenieros(String nombre, int numeroEmpleado, int sueldo, String nombreArea) {
        super(nombre, numeroEmpleado, sueldo);
        this.nombreArea = nombreArea;
    }
}

public class TrabajadoresDriver {
    public static void main(String[] args) {
        JefesDepartamento j = new JefesDepartamento("Jimenez", 22, 10000, "recursos humanos");
        Ingenieros i = new Ingenieros("Rodriguez", 100, 8000, "mantenimiento");

        System.out.println("El señor " + j.nombre + " jefe del departamento de " + j.nombreDepartamento + " tiene un sueldo de " + j.sueldo + " pesos cobra con el número de empleado " + j.numeroEmpleado);

        System.out.println(" y El ingeniero " + i.nombre + " de " + i.nombreArea + " cobró " + i.sueldo + " pesos");

           
    }
}
