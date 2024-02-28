public class CirculoA {
  public double radio;
  
  public double getArea() {
    return Math.PI*radio*radio;
  }
  
  public static void main(String[] args) {
    CirculoA circulo1 = new CirculoA();
    circulo1.radio = 2.3;
    
    CirculoA circulo2 = new CirculoA();
    circulo2.radio = 3;
    
    CirculoA circulo3 = new CirculoA();
    circulo3.radio = 5.1;
    
    System.out.println("El área del objeto circulo1" + " " + "es" + 
    " " + circulo1.getArea());
  }
}
