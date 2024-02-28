public class ComparableRectangle extends Rectangle
  implements Comparable {

  /** Construir un ComparableRectangle con propiedades especificas */
  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  /** Implementar el metodo compareTo definido en Comparable */
  public int compareTo(Object o) {
    if (getArea() > ((ComparableRectangle)o).getArea())
      return 1;
    else if (getArea() < ((ComparableRectangle)o).getArea())
      return -1;
    else
      return 0;
  }
}
