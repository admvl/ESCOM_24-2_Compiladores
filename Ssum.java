class A {
    public void s(double a, double b) {
        System.out.println(a + b);
    }
}

public class Ssum {
    public static void main(String[] args) {
        A re = new A();
        
        re.s(10.2, 20.4);
    }
}
