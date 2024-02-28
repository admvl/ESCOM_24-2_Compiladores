#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
    const int MAXCUENTA = 5;
    int cuenta;
    
    cout << "NÚMERO    RAÍZ CUADRADA\n";
    cout << "------    -----------\n";

    cout << setiosflags(ios::showpoint);
    for (cuenta = 1; cuenta <= MAXCUENTA; cuenta++)
    cout << setw(4) << cuenta
         << setw(15) << sqrt(double(cuenta)) << endl;
         
    return 0;
}
