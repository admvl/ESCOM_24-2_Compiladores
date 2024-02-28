public class PolymorphismDemo {
  /** Metodo principal */
  public static void main(String[] args) {
    // Display propiedades de circulo y rectangulo
    displayObject(new Circle4(1, "rojo", false));
    displayObject(new Rectangle1(1, 1, "negro", true));
  }

  /** Display propiedades de objetos geometric */
  public static void displayObject(GeometricObject1 object) {
    System.out.println("Creado de " + object.getDateCreated() +
      ".Color es " + object.getColor());
  }
}
