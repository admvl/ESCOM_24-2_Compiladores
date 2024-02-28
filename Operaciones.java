class A {
    public void m(double i) {
        System.out.println(i * 2);
    }
    
    public void s(double a, double b) {
        System.out.println(a + b);
    }
    
    public void r(double c, double d) {
        System.out.println(c - d);
    }
}

public class Operaciones {
    public static void main(String[] args) {
        A re = new A();
        
        re.m(10.2);
        re.s(10.2, 20.4);
        re.r(10.2, 20.4);
    }
}
