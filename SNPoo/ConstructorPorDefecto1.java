class Pajaro {
    String color;
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
}

public class ConstructorPorDefecto1 {
    public static void main(String[] args) {
        Pajaro ave1 = new Pajaro(); // ¡por defecto!
        Pajaro ave2 = new Pajaro();
        
        ave1.setColor("azul");
        ave2.setColor("rojo");
        System.out.println("Hay pajaros de color " + ave1.getColor() + " y " + ave2.getColor());
    }
}
