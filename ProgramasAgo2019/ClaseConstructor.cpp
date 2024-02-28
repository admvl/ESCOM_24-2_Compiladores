#include <iostream>

using namespace std;

class entero {

	int m, n;
public:
	entero(int, int); //Declaracion de Constructor

	void display(void) {
		cout << "m = " << m << "\n";
		cout << "n = " << n << "\n";
	}
};

entero :: entero(int x, int y) {  //Definicion de constructor
	
	m = x;
	n = y;
	}

int main() {

	entero ent1(0, 100);  //Llamada de constructor implicito

	entero ent2 = entero(25, 75); //LLamada de constructor explicito

	cout << "\nOBJETO1" << "\n";
	ent1.display();

	cout << "\nOBJETO2" << "\n";
	ent2.display();

	return 0;
}
