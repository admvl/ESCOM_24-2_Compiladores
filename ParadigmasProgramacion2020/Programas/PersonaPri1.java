class Persona {
    private String nombre;
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

class Trabajador {
    String nombre;
    
    String getNombre() {
        return nombre;
    }

    void setNombre(String nom) {
        nombre = nom;
    }
}

public class PersonaPri1 {
    public static void main(String[] args) {
        Persona op = new Persona();

        op.setNombre("Juan");
        System.out.println(op.getNombre() + "es una persona de la colonia Las Flores");

        Estudiante oe = new Estudiante();

        oe.setNombre("Pedro");
        System.out.println(oe.getNombre() + "el estudiante esta inscrito en ESCOM");

        Trabajador ot = new Trabajador();

        ot.setNombre("Pablo");
        System.out.println(ot.getNombre()+ "es untrabajador que labora en la volskwaguen");
    }
}
