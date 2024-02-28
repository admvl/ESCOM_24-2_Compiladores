class A {
    public void m(double i) {
        System.out.println(i * 2);
    }
}

public class Mmul {
    public static void main(String[] args) {
        A re = new A();
        
        re.m(10.2);
    }
}
