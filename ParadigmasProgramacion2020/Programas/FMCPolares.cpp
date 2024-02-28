#include <iostream>

using namespace std;

void Mostrar(double, double);

int main() {

    Mostrar(5.0, 53.1301);

    return 0;
}

void Mostrar(double r, double a) {
    cout << "\n Las coordenadas polares, son: " << endl;
    cout << "\n La distancia al origen, es: " << r << endl;
    cout << "\n El ángulo en grados con respecto al eje x, es: " << a << endl;

    return;
}
