#include <iostream>

using namespace std;

class elemento {

	static int count;
	int numero;

public:
	void getdata(int a) {

		numero = a;
		count ++;
	
	}

	void getcount(void) {

		cout << "count:";
		cout << count << "\n";
	}

};

int elemento :: count;

int main() {

	elemento a, b, c;
	a.getcount();
	b.getcount();
	c.getcount();

	a.getdata(100);
	b.getdata(200);
	c.getdata(300);

	cout << "Despues de leer los datos" << "\n";

	a.getcount();
	b.getcount();
	c.getcount();

	return 0;
}
