#include <iostream>

using namespace std;

void calculo(double, double,double,double&,double&);

int main() {
    double primernum, segundonum, tercernum, suma, producto;
    
    cout << "Escriba tres números:";
    cin >> primernum >> segundonum >> tercernum;
    
    calculo(primernum, segundonum, tercernum, suma, producto);
    
    cout << "\n La suma de los números, es:" << suma << endl;
    cout << "El producto de los números , es:" << producto << endl;
    
    return 0;
}

void calculo(double n1, double n2, double n3, double& total, double& producto) {
    total = n1 + n2 + n3;
    producto = n1 * n2 * n3;
    
    return;
}
