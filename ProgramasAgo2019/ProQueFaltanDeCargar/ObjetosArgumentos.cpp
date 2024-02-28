#include <iostream>

using namespace std;

class tiempo {

	int horas;
	int minutos;
public:
	void gettiempo(int h, int m) {

		horas = h;
		minutos = m;
	}

	void puttiempo(void) {

		cout << horas << "Horas y";
		cout << minutos << "Minutos" << "\n";
	}

	void sum(tiempo, tiempo);

};

void tiempo :: sum(tiempo t1, tiempo t2) {

	minutos = t1.minutos + t2.minutos;
	horas = minutos/60;
	minutos = minutos%60;
	horas = horas + t1.horas + t2.horas;
	}

int main() {

	tiempo T1, T2, T3;

	T1.gettiempo(2.45);
	T2.gettiempo(3.40);

	T3.sum(T1, T2);

	cout << "T1 = ";
	T1.puttiempo();

	cout << "T2 = ";
	T2.puttiempo();

	cout << "T3 = ";
	T3.puttiempo();

	return 0;
}




