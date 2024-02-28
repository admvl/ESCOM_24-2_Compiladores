#include <iostream>

using namespace std;

void NuevoVal(double&, double&);

int main() {
    double primernum, segundonum;

    cout <<"Escriba dos úmeros:" << endl;
    cin >> primernum >> segundonum;
    cout << "El valor del primer número, es:" << primernum << endl;
    cout << "El valor del segundor número, es:" << segundonum << endl;

    NuevoVal(primernum,segundonum);

    cout << "El nuevo valor del primer número, es:" << primernum << endl;
    
    cout << "El nuevo valor del segundor número, es:" << segundonum << endl;

    return 0;
}

void NuevoVal(double& n1, double& n2) {
    cout << "El valor en n1, es:" << n1 << endl;
    cout << "El valor en n2, es:" << n2 << endl;

    n1 = 99.5;
    n2 = 109.5;

    return;
}
