#include <iostream>

using namespace std;

int suma(int actual, int fin) {
    int siguiente = actual + 1;
    
    if(actual != fin) {
        return actual + suma(siguiente, fin);
    }
    else {
        return fin;
    }
}

int main(){
    int n;
    cin >> n;
    
    int resultado = suma(1, n);
    
    cout << resultado << endl;
    
    return 0;
}
