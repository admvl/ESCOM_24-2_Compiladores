#include <iostream>

using namespace std;

class muestra {

	int a;
	int b;
public:
	void setvalor() {

		a = 25;
		b = 40;
	}

	friend float mean(muestra s);

};

float mean(muestra s) {

	return float(s.a + s.b)/2.0;
}

int main() {

	muestra x;
	x.setvalor();
	cout << "Valor principal =" << mean(x) << "\n";
	
	return 0;

}
