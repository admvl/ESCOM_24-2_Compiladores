#include <iostream>

using namespace std;

int count = 0;

class alfa {

public:
	alfa() {
		cuenta++;
		cout << "\nNumero de objeto creado" << cuenta ;
	}

	~alfa() {
		cout << "\nNumero de objeto destruido" << cuenta ;
		cuenta--;
	}

};

int main() {

	cout << "\n\nENTER MAIN\n";
	
	alfa A1, A2, A3, A4;
	
	{
		cout << "\n\nENTER DE BLOQUE1\n";
		alfa A5;
	}

	{
		cout << "\n\nENTER DE BLOQUE1\n";
		alfa A6;
	}
	
	cout << "\n\nRE-ENTER MAIN\n";

	return 0;

}
