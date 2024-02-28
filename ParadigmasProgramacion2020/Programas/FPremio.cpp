#include <iostream>

using namespace std;

void getPremio(double&, double&);

int main() {
    double a, b;

    getPremio(a,b);

    cout << "Escriba un valor para a " << a << endl;
    cout << "Escriba un valor para b " << b << endl;

    return 0;
}

void getPremio(double& x, double& y) {
    cout << "Coordenada rectangular a polar." 
         << "Programa de conversión: \n" << endl;
    cout << "Escriba la coordenada x:";
    cin >> x;
    cout << "Escriba la coordenada y:";
    cin >> y;

    return;
}
