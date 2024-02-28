
public class TestCirculoRectangulo {
  public static void main(String[] args) {
    Circle4 circle = new Circle4(1);
    System.out.println("Un circulo " + circle.toString() );
    System.out.println("El radio es " + circle.getRadius() );
    System.out.println("El area es " + circle.getArea() );
    System.out.println("El diametro es " + circle.getDiameter() );

    Rectangle1 rectangle = new Rectangle1(2, 4);
    System.out.println("\nUn rectangulo " + rectangle.toString() );
    System.out.println("El area es " + rectangle.getArea() );
    System.out.println("El perimetro es " +
      rectangle.getPerimeter() );
  }
}

