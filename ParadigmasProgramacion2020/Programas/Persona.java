public class Persona {
    String nombre;
    int edad;
    char genero;

    String getNombre() {
        return nombre;
    }

    void setNombre(String nom) {
        nombre = nom;
    }

    int getEdad() {
        return edad;
    }

    void setEdad(int e) {
        edad = e;
    }

    char getGenero() {
        return genero;
    }

    void setGenero(char g) {
        genero = g;
    }

    public static void main(String[] args) {
        Persona op = new Persona();

        op.setNombre("Juan");
        System.out.println(op.getNombre() + " es un estudiante que esta cursando Paradigmas.");

        Estudiante oe = new Estudiante();

        oe.setNombre("Pedro");
        System.out.println(oe.getNombre());

        Trabajador ot = new Trabajador();

        ot.setNombre("Pablo");
        System.out.println(ot.getNombre());
    }
}

class Estudiante {
    String nombre;
    
    String getNombre() {
        return nombre;
    }

    void setNombre(String nom) {
        nombre = nom;
    }
}

class Trabajador {
    String nombre;
    
    String getNombre() {
        return nombre;
    }

    void setNombre(String nom) {
        nombre = nom;
    }
}
