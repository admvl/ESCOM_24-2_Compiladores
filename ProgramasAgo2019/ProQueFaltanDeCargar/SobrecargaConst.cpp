#include <iostream>

using namespace std;

class complejo {

	float m, n;
public:
	complejo() {

		float x, y;
	public:
		complejo() {}
		complejo(float) {
			x = y = a;
		}

		complejo(float real, float imag) {
			x = real;
			y = imag;
		}

		friend complejo sum(complejo, complejo);
		friend void show(complejo);
};

	complejo sum(complejo c1, complejo c2) {
		complejo c3;
		c3.x = c1.x + c2.x;
		c3.y = c1.y + c2.x;
		return(c3);
	}

void show(complejo c) {
	cout << c.x << " + j" << c.y << "\n";
}

int main() {

	complejo A(2.7, 3.5);
	complejo B(1.6);
	complejo C;

	C = sum(A, B);
	cout << "A = ";
	show(A);

	cout << "B = ";
	show(B);

	cout << "C = ";
	show(C);

	complejo P, Q, R;

	P = complejo(2.5, 3.9);
	Q = complejo(1.6, 2.5);
	R = sum(P, Q);

	cout << "\n";
	cout << "P = ";
	show(P);
	cout << "Q = ";
	show(Q);
	cout << "R = ";
	show(R);

	return 0;
	
}
