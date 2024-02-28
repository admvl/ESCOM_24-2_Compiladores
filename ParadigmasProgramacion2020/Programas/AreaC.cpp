#include <iostream>
#include <cmath>

using namespace std;

int main() {
    double r;
    
    cout << "Escriba el radio";
    cin >> r;
    
    if(r < 0)
        cout << "Un radio negativo es invalido.";
    else
        cout << "El area de este círculos, es:";
}
