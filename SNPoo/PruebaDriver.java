class Forma {
     public void dibujar() {
       System.out.println("Se dibuja una forma");
     }
}

class Circulo extends Forma {
     public void dibujar() {
       System.out.println("Se dibuja un circulo");
     }
}

class Triangulo extends Forma {
     public void dibujar() {
       System.out.println("Se dibuja un triangulo");
     }
}

public class PruebaDriver {
     public static void main(String[] args) {
       Forma s;
       s = new Forma();
       s.dibujar();
       
       s = new Circulo();
       s.dibujar();

       s = new Triangulo();
       s.dibujar();
     }
}
