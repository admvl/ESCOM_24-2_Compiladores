class Externa {
    int externo_x = 100;
    
    void prueba() {
        Interna interior = new Interna();
        interior.visualizar();
    }
    
    class Interna {
        int y = 10;
        
        void visualizar() {
            System.out.println("Ver: externo_x = " + externo_x);
        }
        
        void mostrarY() {
            System.out.println(y);
        }
    }
    
    /*void mostrarY() {
        System.out.println(y);
    }*/
}

public class InternaDemostracion1 {
    public static void main(String[] args) {
        Externa exterior = new Externa();
        exterior.prueba();
        
        Externa.Interna i = exterior.new Interna();
        i.mostrarY();
    }
}
