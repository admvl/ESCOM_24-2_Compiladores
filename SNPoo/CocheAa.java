public class CocheAa {
  public String marca;
  public int anio;
  public String color;
  
  public void caracteristicaCoche(String marca, int anio, String color) {
    this.marca = marca;
    this.anio = anio;
    this.color = color;
  }
  
  public String getMarca() {
    return marca;
  }
  
  public int getAnio() {
    return anio;
  }
  
  public String getColor() {
    return color;
  }
  
  public static void main(String[] args) {
    CocheAa relampago = new CocheAa();
    
    relampago.caracteristicaCoche("Chevrolet", 2020, "azul");
    System.out.println("El chevy es de color " + relampago.getColor());
  }
}
