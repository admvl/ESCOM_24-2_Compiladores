public class AnimalA {
    static String a1;

    void comer() {
        System.out.println("El " + a1 + " come pollo");
    }

    public static void main(String[] args) {
        AnimalA soloVino = new AnimalA();        

        a1 = "perro";
        soloVino.comer();
    }
}
