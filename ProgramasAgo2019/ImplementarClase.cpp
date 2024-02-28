#include <iostream>

using namespace std;

class elemento {

	int numero;
	float costo;
public:
	void getdata(int a, float b);
	void putdata(void) {

		cout << "Numero:" << numero << "\n";
		cout << "Costo:" << costo << "\n";
	}

};

void elemento :: getdata(inta, float b) {

	numero = a;
	costo = b;
	}

int main() {

	elemento x;

	cout << "\nobjeto x" << "\n";

	x.getdata(100, 299.95);
	x.putdata();

	elemento y;

	cout << "\nobjeto y" << "\n";

	y.getdata(200, 175.50);
	y.putdata();

	return 0;

}
