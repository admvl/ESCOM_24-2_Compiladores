#include <iostream>

using namespace std;

int main() {
    int n1, n2, n3;
    double promedio;
    double FuncionPromedio(int n1, int n2, int n3);
    
    cout << "Escriba tres numeros" << "\n";
    cin >> n1 >> n2 >> n3;
    
    double FuncionPromedio(int n1, int n2, int n3);
    
    cout << "El promedio es:" << " " << FuncionPromedio(n1,n2,n3) << "\n";
    
    return 0;
}

double FuncionPromedio(int n1, int n2, int n3) {
    
    double promedio;
    
    promedio = (n1 + n2 + n3)/3.0;
    
    return promedio;
}
