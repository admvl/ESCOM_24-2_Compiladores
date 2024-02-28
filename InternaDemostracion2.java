class Externa {
    int externo_x = 100;
    
    void prueba() {
        for(int i = 0; i < 5; i++) {
            class Interna {
                void visualizar() {
                    System.out.println("Ver: externo_x = " + externo_x);
                }
            }
        
            Interna interior = new Interna();
            interior.visualizar();
        
        }
        
        
    }
}

public class InternaDemostracion2 {
    public static void main(String[] args) {
        Externa exterior = new Externa();
        exterior.prueba();
    }
}
