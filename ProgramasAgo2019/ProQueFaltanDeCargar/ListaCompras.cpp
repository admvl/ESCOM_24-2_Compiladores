#include <iostream>

using namespace std;

const m = 50;

class Elementos {

	int elemntoCodigo[m];
	float elementoPrecio[m];
	int cuenta;
public:
	void CNT(void){
		cuenta = 0;
	}
	void getelemento(void);
	void displaySum(void);
	void remover(void);
	void displayElemento(void);
};

void Elementos :: getelemento(void) {

	cout << "Escribir el codigo elemento:";
	cin >> elementoCodigo[cuenta];

	cout << "Escribir el costo elemento:";
	cin >> elementoPrecio[cuenta];
	cuenta++;
	}

void Elementos :: displaySum(void) {

	float sum = 0;

	for(int i = 0; i < cuenta; i++)
		sum = sum + elementoPrecio[i];

	cout << "\n Valor total:" << sum << "\n";
	}

void Elementos :: remover(void) {

	int a;
	cout << "Escribir elemento codigo:";
	cin >> a;

	for(int i = 0; i < cuenta; i++)
		if(elementoCodigo[i] == a)
			elementoPrecio[i] = 0;
	}

void Elementos :: displayElemento(void) {

	cout << "\nCodigo  Precio\n";

	for(int i = 0; i < cuenta; i++) {

		cout << "\n" << elementoCodigo[i];
		cout << "   " << elemnetoPrecio[i];
	}

	cout << "\n";
}

int main() {
	
	Elementos orden;
	orden.CNT();
	int x;
	do {

		cout << "\n Puedes hacer lo siguiente:"
		<< "Escribir numero apropiado \n";

		cout << "\n1 : Agregar un elemento";
		cout << "\n2 : Desplegar valor total";
		cout << "\n3 : Borrar un elemento";
		cout << "\n4 : Desplegar todos los elementos";
		cout << "\n5 : Salir";
		cout << "\nCual es tu opinion?";

		cin >> x;

		switch(x) {

			case 1 : orden.getelemnto(); break;

			case 2 : orden.displaySum(); break;

			case 3 : orden.remover(); break;

			case 4 : orden.displayElemento(); break;

			case 5 : break;

			default : cout << "Error de entrada: tratar de nuevo";
		}

	} while(x != 5);

	return 0;
}

		
	
