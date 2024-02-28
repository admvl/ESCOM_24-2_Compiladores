#include <iostream>

using namespace std;

class clase2;

class clase1 {

	int valor1;
public:
	void indata(int a) {
		valor1 = a;
	}
	void display(void) {
		cout << valor1 << "\n";
	}
	frienn void exchange(clase1 &, clase2 &);
};

class clase2 {
	int valor2;
public:
	void indata(int a) {
		valor2 = a;
	}
	void display(void) {
		cout << valor2 << "\n";
	}
	friend void exchange(clase1 &, clase2 &);
};

void exchange(clase1 & x, clase2 & y) {
	int temp = x.valor1;
	x.valor1 = y.valor2;
	y.valor2 = temp;
	}

int main() {
	clase1 C1;
	clase2 C2;

	C1.indata(100);
	C2.indata(200);

	cout << "Valores antes de cambiar" << "\n";
	C1.display();
	C2.display();

	exchange(C1, C2);

	cout << "Valores despues de cambiar" << "\n";
	C1.display();
	C2.display();

	return 0;

}
