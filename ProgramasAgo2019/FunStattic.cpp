#include <iostream>

using namespace std;

class prueba {

	int codigo;
	static int cuenta;
public:
	void setCodigo(void) {
		codigo = ++cuenta;
	}

	void muestraCodigo(void) {

		cout << "Numero objeto:" << codigo << "\n";
	}

	static void muestraCuenta(void) {

		cout << "Cuenta:" << cuenta >> "\n";
	}
};

int prueba :: cuenta;

int main() {

	prueba t1, t2;

	t1.setCodigo();
	t2.setCodigo();

	prueba :: muestraCuenta();

	prueba t3;
	t3.setCodigo();

	prueba :: muestraCuenta();

	t1.muestraCodigo();
	t2.muestraCodigo();
	t3.muestraCodigo();

	return 0;
}
