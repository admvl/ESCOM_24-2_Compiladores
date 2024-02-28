class FiguraGeometrica {
   double dimension1;
   double dimension2;

   FiguraGeometrica(double a, double b) {
      dimension1 = a;
      dimension2 = b;
   }

   double area() {
      System.out.println("Área de una figura gemétrica no definida: ");
      return 0;
   }
}

class Rectangulo extends FiguraGeometrica {
   Rectangulo(double a, double b) {
      super(a, b);
   }

   double area() {
      System.out.println("Área de una figura gemétrica no definida: ");
      return dimension1 * dimension2;
   }
}

class Triangulo extends FiguraGeometrica {
   Triangulo(double a, double b) {
      super(a, b);
   }

   double area() {
      System.out.println("Área de una figura gemétrica no definida: ");
      return dimension1 * dimension2 / 2;
   }
}

class CalcularArea {
   public static void main(String[] args) {
      FiguraGeometrica f = new FiguraGeometrica(10, 10);
      Rectangulo r = new Rectangulo(9, 5);
      Triangulo t = new Triangulo(10, 8);

      FiguraGeometrica figura;

      figura = r;
      System.out.println("El área, es: " + figura.area());

      figura = t;
      System.out.println("El área, es: " + figura.area());

      figura = f;
      System.out.println("El área, es: " + figura.area());
   }
}
