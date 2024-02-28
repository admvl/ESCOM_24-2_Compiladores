#include <iostream>

using namespace std;

class ABC;

Class XYZ {

	int x;
public:
	void setvalor(int i) {

		x = i;
	}

	friend void max(XYZ, ABC);
};

class ABC {

	int a;
public:
	void setvalor(int i) {
	
		a = i;
	}

	friend void max(XYZ, ABC);
};

void max(XYZ m, ABC n) {

	if(m.x >= n.a)
		cout << m.x;
	else
		cout << n.a;
	}

int main() {

	ABC abc;
	abc.setvalor(10);
	XYZ xyz;
	xyz.setvalor(20);
	max(xyz, abc);

	return o;

}


