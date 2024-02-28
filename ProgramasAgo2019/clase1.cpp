#include <iostream>

using namespace std;

class person
{
	char name[30];
	int age;
	
	public:
		void getdata(void);
		void display(void);
};

void person :: getdata(void)
{
	cout << "Agregar Nombre:" ;
	cin >> name;
	cout << "Agregar Edad:";
	cin >> age;
}

void person :: display(void)
{
	cout << "\nNombre:" << name;
	cout << "\nEdad:" << age;
}

int main()
{
	person p;

	p.getdata();
	p.display();

	return 0;
}
