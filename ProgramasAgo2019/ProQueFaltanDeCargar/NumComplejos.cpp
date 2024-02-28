#include <iostream>

using namespace std;

class compleja {

	float x;
	float y;
public:
	void input(float real, float imag) {
		x = real;
		y = imag;
	}

	friend complejo sum(complejo, complejo)

	void show(complejo);

};

complejo sum(complejo c1, complejo c2) {
	complejo c3;
	c3.x = c1.x + c2.x;
	c3.y = c1.y + c2.y;
	return(c3);
};

void complejo :: show(complejo c) {
	cout << c.x << "  + j" << c.y << "\n";
	}

int main() {

	complejo A, B, C;

	A.input(3.1, 5.65);
	B.input(2.75, 1.2);
	
	C = sum(a, B);

	cout << "A = ";
	A.show(A);

	cout << "B = ";
	B.show(B);

	cout << "C = ";
	C.show(C);

	return 0;
}



	
