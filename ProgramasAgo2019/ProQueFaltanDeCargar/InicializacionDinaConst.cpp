#include <iostream>

using namespace std;

class DepositoFijo {

	long int P_cantidad;
	int year;
	float Relacion;
	float R_valor;
public:
	DepositoFijo() {}
	DepositoFijo(long int p, int y, float r = 0.12);
	DepositoFijo(long in p, int y, int r);
	void display(void);
};

DepositoFijo :: DepositoFijo(long int p, int y, int r) {
	p_cantodad = p;
	year = y;
	Relacion = r;
	R_valor = P_cantidad;
	
	for(int i = 1; i <= y; i++)
		R_valor = R_valor(1.0 + float(r)/100);
	}

void DepositoFijo :: display(void) {
	cout <<"\n";
	     << "Candidad principal = " << P_cantidad << "\n";
	     << "Valor de regreso =" << R_valor << "\n";
	}

int main() {

	DepositoFijo FD1, FD2, FD3;
	
	long int p;
	
	int y;
	float r;
	int R;

	cout <<"Escribir cantidad, periodo, interes, relacion(Forma decimal)" << "\n";
	cin >> p >> y >> R;
	FD1 = DepositoFijo(p, y, R);

	cout <<"Escribir cantidad, periodo, interes, relacion(Forma decimal)" << "\n";
	cin >> p >> y >> r;
	FD2 = DepositoFijo(p, y, r);

	cout <<"Escribir cantidad y periodo" << "\n";
	cin >> p >> y;
	FD3 = DepositoFijo(p, y);

	cout <<"\nDeposito 1";
	FD1.display();

	cout <<"\nDeposito 2";
	FD2.display();

	cout <<"\nDeposito 3";
	FD3.display();

	return 0;

}

