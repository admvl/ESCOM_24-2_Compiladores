public class Car2 {
  private String make; // fabricacion de car
  private int year; // anio de car
  private String color; // color de car
  //***********************************
  public Car2(String make, int year, String color) {
    this.make = make;
    this.year = year;
    this.color = color;
  } // fin de constructor Car2

  //*************************************

  public String toString() {
    return "fabricacion = " + make + ", anio = " + year +
      ", color = " + color;
  } // fin toString

  //************************************
  public static void main(String[] args) {
    Car2 car = new Car2("Honda", 1998, "plata");
    System.out.println(car);
  } // fin main
} // fin class Car2
