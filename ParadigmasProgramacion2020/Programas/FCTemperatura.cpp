#include <iostream>
#include <iomanip>

using namespace std;

void ConvTem(char, double, double&, double&);

int main() {
    char Tt;
    double t, fa, ce;
    
    cout << "Escribe la temperatura a ser convertida;" << endl;
    cin >> t;
    cout << "Escriba f si la temperatura esta en grados Fahrenheit" << endl;
    cout <<"\n or c si esta en grados celsius:" << endl;
    cin >> Tt;
    
    ConvTem(Tt,t,fa,ce);
    
    return 0;
}

void ConvTem(char Tt, double t, double& fa, double& ce) {
       
    
    if(Tt == 'f') {

        ce = (5.0/9.0) * (t - 32.0);
        cout << "Los grados celsius, son: " << ce << endl;
    }
    else{
    
        fa = (9.0/5.0) * t + 32.0;
        cout << "Los grados Fahrenheit, son: " << fa << endl;
    }
    return;
    
}
