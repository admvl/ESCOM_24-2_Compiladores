#include <iostream>

using namespace std;

int serie ();
int respuesta (int V);

int main () {
    cout << serie();
    cout << respuesta(serie());
    
    return 0;
}

int serie () {
	int x,x1;

	cout<< "\n" << "Escribe un valor" << endl;
	cin >> x;
	x1 = x + 10;
	
	return x1;
}

int respuesta (int V) {
	int x2 = 0;

	x2 = V * 5;

        return x2;
}
