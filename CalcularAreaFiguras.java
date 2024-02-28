class FiguraGeometrica {
         public String color;
         public boolean rellenado;
         public java.util.Date datoCreado;
         public double dimension1;
         public double dimension2;
         
         public FiguraGeometrica(double a, double b) {
            dimension1 = a;
            dimension2 = b;
         }
         
         /** Constructor */
         public FiguraGeometrica() {
           datoCreado = new java.util.Date();
         }
         
        /** Constructor con un color especifico * y valor rellenado */
         public FiguraGeometrica(String Color, boolean rellenado) {
           datoCreado = new java.util.Date();
           this.color = color;
           this.rellenado = rellenado;
         }
         
         /** Color retornado */
         public String getColor() {
           return color;
         }
         
         /** Poner un nuevo color */
         public void setColor(String color) {
           this.color = color;
         }
         
         /** Rellenado regresado. De un rellenado boolean,
           su metodo get es nombrado esRellenado */
         public boolean esRellenado() {
           return rellenado;
         }
         
         /** Poner un nuevo rellenado */
         public void setRellenado(boolean rellenado) {
           this.rellenado = rellenado;
         }
         
         /** Conseguir datoCreado */
         public java.util.Date getDatoCreado() {
           return datoCreado;
         }
         
         /** Regresa una cadena que representa a este objeto */
         public String toString() {
           return "creatdo en " + datoCreado + "\ncolor: " + color +
             " y rellenado: " + rellenado;
         }
}

class Rectangulo extends FiguraGeometrica {
          Rectangulo(double a, double b) {
          super(a, b);
      }

      double getArea() {
          System.out.println("Área de una figura gemétrica no definida: ");
          return dimension1 * dimension2;
      }
}

class Triangulo extends FiguraGeometrica {
      Triangulo(double a, double b) {
          super(a, b);
      }

      double getArea() {
          System.out.println("Área de una figura gemétrica no definida: ");
          return dimension1 * dimension2 / 2;
      }
}

class Circulo extends FiguraGeometrica {
          private double radio;
          
          public Circulo() {
          }
          
          public Circulo(double a, double b) {
            super(a, b);
            radio = a;
          }
          
          public Circulo(double radio, String color, boolean rellenado) {
            this.radio = radio;
            setColor(color);
            setRellenado(rellenado);
          }
          
          public double getRadio() {
            return radio;
          }
          
          public void setRadio(double a) {
            this.radio = radio;
          }
          
          public double getArea() {
            return Math.PI * radio * radio ;
          }
          
          public double getPerimetro() {
            return  2 * radio * Math.PI;
          }
          
          public double getDiametro() {
            return 2 * radio;
          }
          
          public void imprimirCirculo() {
            System.out.println("El circulo es creado " + getDatoCreado() +
" y el radio es " + radio);
          }
}

public class CalcularAreaFiguras {
          public static void main(String[] argas) {
             Rectangulo r = new Rectangulo(5,10);
             Triangulo t = new Triangulo(5,10);
             Circulo c = new Circulo(32, 0);
             
             System.out.println("El área del círculo, es: " + c.getArea());
             System.out.println("El área del rectángulo, es: " + r.getArea());
             System.out.println("El área del triángulo, es: " + t.getArea());
          }
}
