#include <iostream>
#include <string.h>

using namespace std;

class cadena {

	char *nombre;
	int longitud;
public:
	cadena() {

		longitud = 0;
		nombre = new char[longitud + 1];
	}

	cadena(char *s) {
		longitud = strlen(s);
		nombre = new char[longitud + 1];
	
		strcpy(nombre, s);
	}


	void display(void) {
		cout << nombre << "\n";
	}

	void join(cadena &a, cadena &b);

};

void cadena :: join(cadena &a, cadena &b) {
	longitud = a.longitud + b.longitud;
	delete nombre;
	nombre = new char[longitud +1];

	strcpy(nombre, a.nombre);
	strcat(nombre, b.nombre);
};

int main() {
	char *primero = "jose";
	cadena nombre1(primero), nombre2("Luis"), nombre("Lorenzo"),s1,s2;
	
	s1.join(nombre1, nombre2);
	s2.join(s1, nombre3);
	nombre1.display();
	nombre2.display();
	nombre3.display();
	s1.display();
	s2.display();

	return 0;

}
