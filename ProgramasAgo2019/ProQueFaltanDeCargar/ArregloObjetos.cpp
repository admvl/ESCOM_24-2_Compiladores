#include <iostream>

using namespace std;

class empleo {

	char nombre[30];
	float edad;
public:
	void getdata(void);
	void putdata(void);
};

void empleo :: getdata(void) {

	cout << "Escribir nombre:";
	cin >> nombre;
	cout << "Escribir edad:";
	cin >> edad;
	}

void empleo :: putdata(void) {

	cout << "Nombre:" << nombre << "\n";
	cout << "Edad:" << edad << "\n";
	
	}

const int size = 3;

int main() {

	empleo manager[size];
	for(int i = 0; i < size; i++) {

		cout << "\nDetalles manager:" i + 1 << "\n";
		manager[i].putdata();
	}

	return 0;

}
