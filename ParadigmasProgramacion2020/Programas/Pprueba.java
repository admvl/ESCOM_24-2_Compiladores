public class Pprueba {
    public static void main(String[] args) {
        Circulo3 c2 = new Circulo3(6.0);
        imprimirCirculo(c2);
    }
    
    public static void imprimirCirculo(Circulo3 c) {
        System.out.println("El area de el circulo de radio: " + c.getRadio() + " es " + c.getArea());
    }
}
