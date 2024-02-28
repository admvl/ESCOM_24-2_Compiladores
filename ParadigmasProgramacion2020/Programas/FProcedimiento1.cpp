#include <iostream>

using namespace std;

void ordenar(int& x, int& y) {
    if (x > y) {
        int z = x;
        x = y;
        y = z;
    }
}

int calcularSuma(int x, int y) {
    int suma = 0;
    
    for (int i = 0; i < x; ++i) {
        suma = suma + y;
    }
    return suma;
}

int realizarProducto(int x, int y) {
    ordenar(x, y);

    return calcularSuma(x, y);
}

void leerDatos(int& x, int& y) {
    cout << "Introduce dos números";
    cin >> x >> y;
}

void mostrarResultado(int r) {
    cout << "Resultado: " << r << endl;
}

int main() {
    int a, b, c;
    leerDatos(a, b);
    c = realizarProducto(a, b);
    mostrarResultado(c);
}
