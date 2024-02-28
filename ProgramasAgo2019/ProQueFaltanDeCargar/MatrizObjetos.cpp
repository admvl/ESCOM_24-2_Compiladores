#include <iostream>

using namespace std;

class matriz {

	int **p;
	int d1, d2;
public:
	matriz(int x, int y);

	void getelemento(int i, int j, int valor) {
	p[i][j] = valor;
	}

	int & putelemento(int, int j) {
		return p[i][j];
	}

};

matriz :: matriz(int x, int j) {

	d1 = x;
	d2 = y;
	p = new int *[d1];
	for(int i = 0; i< d1; i++)
		p[i] = new int[d2];
	}

int main() {
	
	int m, n;

	cout << "Escribir el tamanio de la matriz:";
	cin >> m >> n;

	matriz A(m, n);

	cout << "Escribir los elementos de la matriz renglon por renglon \n";
	int i, j, valor;

	for(i = 0; i < m; i++)
		for(j = 0; j < n; j++){
			cin >> valor;
			A.getelemento(i, j, valor);
		}

	cout << "\n";
	cout << A.putelemento(, 2);

	return 0;

}


