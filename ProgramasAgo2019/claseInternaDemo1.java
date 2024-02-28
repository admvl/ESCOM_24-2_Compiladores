// Definir una clase interna dentro de un for.
class Outer {
	int outer_x = 100;
	
	void test() {
		for(int i=0; i<10; i++) {
			class Inner {
				void display() {
					System.out.println("desplegar: outer_x = " + outer_x);
				}
			}

	Inner inner = new Inner();
	inner.display();
		
		}
	}
}

class claseInternaDemo1 {
	public static void main(String args[]) {
	Outer outer = new Outer();
	outer.test();
	}
}

