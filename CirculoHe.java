class FiguraGeometrica {
         private String color = "blanco";
         private boolean rellenado;
         private java.util.Date datoCreado;
         
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
       
       class Circulo extends FiguraGeometrica {
          private double radio;
          
          public Circulo() {
          }
          
          public Circulo(double radio) {
            this.radio = radio;
          }
          
          public Circulo(double radio, String color, boolean rellenado) {
            this.radio = radio;
            setColor(color);
            setRellenado(rellenado);
          }
          
          public double getRadio() {
            return radio;
          }
          
          public void setRadio(double radio) {
            this.radio = radio;
          }
          
          public double getArea() {
            return radio * radio * Math.PI;
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
       
       public class CirculoHe {
         
          public static void main(String[] args) {
             Circulo circulo = new Circulo(17, "rosa", true);
             
             System.out.println("Un circulo " + circulo.toString());
             System.out.println("El radio es " + circulo.getRadio());
             System.out.println("El área es " + circulo.getArea());
             System.out.println("El diametro es " + circulo.getDiametro());
             
             //Rectangulo rectangulo = new Rectangulo1(2, 4);
             //System.out.println("\nUn rectangulo " + rectangulo.toString());
             //System.out.println("El area es " + rectangulo.getArea());
             //System.out.println("El perimetro es " +
               //rectangulo.getPerimetro());
          }
         
       }
