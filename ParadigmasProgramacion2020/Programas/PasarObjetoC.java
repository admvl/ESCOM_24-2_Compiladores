public class PasarObjetoC {
    public static void main(String[] args) {
        Circulo3 c3 = new Circulo3(2);
        
        int n = 5;
        imprimirAreas(c3, n);
        
        System.out.println("\n" + " el radio es: " + c3.getRadio());
        
        System.out.println("n es " + n);
    }
    
    public static void imprimirAreas(Circulo3 c, int veces) {
        System.out.println("El radio \t\tArea");
        
        while(veces >= 1) {
            System.out.println(c.getRadio() + "\t\t" + c.getArea());
            c.setRadio(c.getRadio() + 1);
            veces--;
        }
    }
}
