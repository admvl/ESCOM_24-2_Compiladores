#include <iostream>

using namespace std;

int main() {
    int n1, n2, n3;
    double promedio;
    
    promedio = 0;
    cout << "Escriba tres números enteros";
    cin >> n1 >> n2 >> n3;
    
    promedio = ( n1 + n2 + n3)/3.0;
    
    cout << "El promedio de los tres números, es" << promedio;
    
    return 0;
}
