public class CocheAb {
  public String marca;
  public int anio;
  public String color;
  
  public void caracteristicaCoche(String marca, int anio, String color) {
    this.marca = marca;
    this.anio = anio;
    this.color = color;
  }
  
  public void verCaracteristicas() {
    System.out.printf("marca = %s\nanio = %s\ncolor = %s\n" , this.marca, this.anio, this.color);
  }
  
  public static void main(String[] args) {
    CocheAb relampago = new CocheAb();
    
    relampago.caracteristicaCoche("Volkswaguen", 2000, "cafe");
    relampago.verCaracteristicas();
  }
}
