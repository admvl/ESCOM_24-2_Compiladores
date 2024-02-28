class Externa {
    int externo_x = 100;
    
    void prueba() {
        Interna interior = new Interna();
        interior.visualizar();
    }
    
    class Interna {
        void visualizar() {
            System.out.println("Ver");
        }
    }
}

public class InternaDemostracion {
    public static void main(String[] args) {
        Externa exterior = new Externa();
        exterior.prueba();
    }
}
