#include <iostream>
#include <cmath>

using namespace std;

int f(int v);
int g();

int main() {
    
    cout << f(g()) << endl;
    
    return 0;
}

int g() {
	int x,x1;

	cout<< "\n" << "Escriba un valor de x para la función g() " << endl;
	cin >> x;
	x1 = 2 * x + 1;
	
	return x1;
}

int f(int v) {
	int x2 = 0;
    
    cout<< "\n" << "El valor de la función f(), es: " << endl;
	
	x2 = 2 * pow(v, 2) + 3 * v + 2;

    return x2;
}
