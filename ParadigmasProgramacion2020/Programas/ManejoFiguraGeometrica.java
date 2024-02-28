public abstract class FiguraGeometrica {
    private String color = "while";
    private boolean rellenado;
    private java.util.Date datoCreado;
    
    protected FiguraGeometrica() {
        datoCreado = new java.util.Date();
    }
    
    protected FiguraGeometrica(String color, boolean rellenado) {
        datoCreado = new java.util.Date();
        this.color = color;
        this.rellenado = rellenado;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean esRellenado() {
        return rellenado;
    }
    
    public void setRellenado(boolean rellenado) {
        this.rellenado = rellenado;
    }
    
    public java.util.Date getDatoCreado() {
        retrun datoCreado;
    }
    
    public String toString() {
        return "Crear " + datoCreado + "\color " + color + "y rellenado " + rellenado;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimetro();

}

class Circulo extends FiguraGeometrica {

}

class Rectangulo extends FiguraGeometrica {

}

public class ManejoFiguraGeometrica {
    public static void main(String[] args) {
        FiguraGeometrica og1 = new Circulo(5);
        FiguraGeometrica og2 = new Rectangulo(5,3);
        
        System.out.println("Las dos figuras tienen la misma área " + esIgualArea(og1, og3);
    }
    
        desplegarFiguraGeometrica(og1);
    
        desplegarFiguraGeometrica(og2);
    }
    
    public static boolean esIgualArea(FiguraGeometrica o1, FiguraGeometrica o2) {
        return o1.getArea() == o2.getArea();
    }
    
    public static void desplegarFiguraGeometrica(FiguraGeometrica o) {
        System.out.println();
        System.out.println("El area es: " + o.getArea());
        System.out.println("El perimetro es: " + o.getPerimetro());
    }
}
