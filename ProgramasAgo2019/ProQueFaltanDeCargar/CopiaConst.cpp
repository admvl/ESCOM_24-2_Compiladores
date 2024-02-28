#include <iostream>

using namespace std;

class DepositoFijo {

	int id;
public:
	codigo() {}
	codigo(int a) {
		id = x.id;
	}
	void display(void) {
		cout << id;
	}

};

int main() {
	
	codigo A(100);
	codigo B(A);
	codigo C = A;

	codigo D;
	D = A;

	cout << "\n id de A: ";
	A.display();
	cout << "\n id de B: ";
	B.display();
	cout << "\n id de C: ";
	C.display();
	cout << "\n id de D: ";
	D.display();

	return 0;
}
