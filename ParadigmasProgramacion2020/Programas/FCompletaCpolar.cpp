#include <iostream>
#include <cmath>

using namespace std;

void getInformacion(double&,double&);
void CalculoPolar(double,double,double&, double&);
void Mostrar(double, double);

int main() {
    double x, y, d, a;

    getInformacion(x,y);
    CalculoPolar(x, y, d, a);
    Mostrar(d, a);

    return 0;
}

void getInformacion(double& x, double& y) {
    cout << "Coordenada rectangular a polar." 
         << "Programa de conversión: \n" << endl;
    cout << "Escriba la coordenada x:";
    cin >> x;
    cout << "Escriba la coordenada y:";
    cin >> y;

    return;
}

void CalculoPolar(double x, double y, double& r, double& theta) {
    const double T = 180.0/3.14159;

    r = sqrt(x + y * y);
    theta = atan(y/x) * T;

    return;
}

void Mostrar(double r, double a) {
    cout << "\n Las coordenadas polares, son:" << endl;
    cout << "\n La distancia al origen, es:" << r << endl;
    cout << "\n El ángulo en grados con respecto al eje x, es:" << a << endl;

    return;
}
