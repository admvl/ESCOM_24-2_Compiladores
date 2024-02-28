public class Circulo3P {
    public static void main(String[] args) {
        Circulo3 c1 = new Circulo3(4.0);
        
        System.out.println("El area del circulo de radio: " + " es ");
        
        c1.setRadio(c1.getRadio() * 1.1);
        
        System.out.println("El area del circulo de radio: " + " es ");
        
        System.out.println("El número de objetos creados es: " + Circulo3.getNumeroDeObjetos());
    }
}
