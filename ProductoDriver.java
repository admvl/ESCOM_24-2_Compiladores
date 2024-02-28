class Producto {
  private String compania;
  private double precio;
  private int cantidadVendida = 1;
  
  public Producto(String compania, double precio) {
    this.compania = compania;
    this.precio = precio;
  }
  
  public void venta() {
    cantidadVendida++;
  }
  
  public void setPrecio(double nuevoPrecio) {
    precio = nuevoPrecio;
  }
  
  public String toString() {
    return "Compañía: " + compania + " precio: " + precio + " cantidad vendida: " + cantidadVendida;
  }
}
  
class Television extends Producto {
    private String modelo;
    
    public Television(String modelo, String compania, double precio) {
      super(compania, precio);
      this.modelo = modelo;
    }
    
    public String toString() {
      return super.toString() + " modelo: " + modelo;
    }
}
  
class Libro extends Producto {
    private String titulo;
    private String autor;
    //private double precio;
    private String editor;
    //private int cantidadVendida;
    
    public Libro(String titulo, String autor, String compania, double precio) {
      super(compania, precio);
      this.titulo = titulo;
      this.autor = autor;
    }
    
    //public void venta() {
      //cantidadVendida++;
    //}
    
    //public void setPrecio(double nuevoPrecio) {
      //precio = nuevoPrecio;
    //}
    
}
  
public class ProductoDriver {
    public static void main(String args[]) {
      Libro l = new Libro("Crimen y castigo", "Dostoivsky", "Porrua", 340.2);
      System.out.println(l.toString());
      
      Television tv1 = new Television("S1", "Samsung", 4000.0);
      System.out.println(tv1.toString());
    }
}
  
  
