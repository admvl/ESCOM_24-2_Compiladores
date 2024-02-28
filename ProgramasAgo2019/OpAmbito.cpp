#include <iostream>

using namespace std;
int m=10;

int main(){

	int m=20;
	
	{
	
		int k = m;
		int m = 30;
		
		cout << "Estamos dentro del bloque \n";
		cout << "k = " << k << "\n" ;
		cout << "m = " << m << "\n" ;
		cout << "::m = " << ::m << "\n" ;
	
	}
	
		cout << "\nEstamos fuera del bloque \n" ;
		cout << "m = " << m << "\n" ;
		cout << "::m = " << ::m << "\n" ;
		
		return 0;

}
