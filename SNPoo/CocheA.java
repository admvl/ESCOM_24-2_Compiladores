public class CocheA {
  public String marca;
  public int anio;
  public String color;
  
  public void setMarca(String marca) {
    this.marca = marca;
  }
  
  public void setAnio(int anio) {
    this.anio = anio;
  }
  
  public void setColor(String color) {
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
    CocheA rayoMac = new CocheA();
    
    rayoMac.setMarca("Ford");
    rayoMac.setColor("Rojo");
    System.out.println(rayoMac.getMarca() + " " + rayoMac.getColor());
  }
}
