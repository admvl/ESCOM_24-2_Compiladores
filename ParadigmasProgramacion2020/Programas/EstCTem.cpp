#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    char Tt;
    double t, fa, ce;
    
    cout << "Escribir la temperatura a ser convertida: ";
    cin >> t;
    cout << "Escribir f si la temperatura esta en grados Fahrenheit";
    cout << "\n or c si esta en grados Celsius: ";
    cin >> Tt;

    if (Tt == 'f') {
        ce = (5.0 / 9.0) * (t - 32.0);
        cout << "\nEl equivalente en grados Celsius, es: "
             << ce << endl;
    }
    else {
        fa = (9.0 / 5.0) * t + 32.0;
        cout << "\nEl equivalente en grados Fahrenheit, es: "
             << fa << endl;
    }
    return 0;
}
