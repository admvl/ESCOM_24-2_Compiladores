interface Alimentos {
         
    public void servir();
    public void preparar();
}
     
class Bocadillos implements Alimentos {
         
    public void preparar() {
        System.out.println("Una torta de jamón se prepara con pan y jamón");    
    }
         
    public void servir() {
        System.out.println(" y se sirve en un plato extendido");
    }
     
}
    
class Cafes implements Alimentos {
         
    public void preparar() {
        System.out.println("Un café americano se prepara con dos onzas de café en grano");
    }
         
    public void servir() {
        System.out.println(" y se sirve en una taza mediana");  
    }  
     
}

public class Refrigerio {
    public static void main(String[] args) {
        Bocadillos t = new Bocadillos();
        Cafes c = new Cafes();
        
        t.preparar();
        t.servir();
        System.out.println();
        c.preparar();
        c.servir();
        
    }
}
