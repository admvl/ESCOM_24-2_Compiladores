#include <iostream>

using namespace std;

class poner {

	int m, n;
public:
	void entrada(void);
	void display(void);
	void largest(void)

};


int poner :: largest(void) {

	if(m >= n)
		return(m);
	else
		return(n);
	}


void poner :: entrada(void) {

	cout << "Entrada de valores de m y n" << "\n";
	cin >> m >> n;
	}

void poner :: display(void) {

		cout << "El valor mas grande:" << 			largest() << "\n";
		
	}


int main() {

	poner A;

	A.entrada();
	A.display();

	return 0;

}
