class Persona {
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

public class PersonaPri {
    public static void main(String[] args) {
        Persona op = new Persona();

        op.setNombre("Juan");
        System.out.println(op.getNombre());

        Estudiante oe = new Estudiante();

        oe.setNombre("Pedro");
        System.out.println(oe.getNombre());
    }
}
