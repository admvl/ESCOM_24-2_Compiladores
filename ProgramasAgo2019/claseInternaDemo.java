// Demostracion de una clase interna.
class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// esta es una clase interna
	class Inner {
		void display() {
			System.out.println("desplegar: outer_x = " + outer_x);
		}
	}
}

class claseInternaDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
	}
}
