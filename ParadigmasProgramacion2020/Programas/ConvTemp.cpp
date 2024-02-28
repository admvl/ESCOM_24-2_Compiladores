#include <iostream>

using namespace std;

int main() {
    double fa, ce;
    double celsius(double fa);
    
    cout << "Escribir la temperatura en grados fahrenheit:";
    cin >> fa;
    
    double celsius(double fa);
    
    cout << "La temperatura en celsius, es:" << celsius(fa) << endl;

    return 0;
}

double celsius(double fa) {
    double ce;

    ce = (5.0/9.0)*(fa - 32.0);
    
    return ce;

}
