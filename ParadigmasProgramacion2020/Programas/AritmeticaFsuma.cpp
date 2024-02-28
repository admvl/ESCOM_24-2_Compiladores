#include <iostream>

using namespace std;

int f1();
int f2();
int FuncionSuma(int v, int w);

int main() {
    
    cout << FuncionSuma(f1(), f2()) << endl;

    return 0;
}

int f1() {
    int x,x1;

	cout<< "\n" << "Escribe un valor para el polinomio UNO" << endl;
	cin >> x;
	x1 = 6 * x + 3;

    return x1;
}

int f2() {
    int x,x1;

	cout<< "\n" << "Escribe un valor para el polinomio DOS" << endl;
	cin >> x;
	x1 = 12 * x + 7;

    return x1;
}

int FuncionSuma(int v, int w) {
    int x2 = 0; 

    x2 = v + w;
    cout << "El resultado, es: ";

    return x2;
}
