#include <iostream>
#include <list>
#include <string>

using namespace std;

int main() {
    int n, num;
    list <int> lisNum;

    cout << "Escriba el tamaño de lista: " << endl;
    cin >> n;

    while(n != 0) {
        cout << "Escribe el elemento a guardar en la lista: " << endl;
        cin >> num;
        cout << endl;
        
        lisNum.push_back(num);

        n = n - 1;
    }

    for( auto i : lisNum)
        cout << i << endl;

    lisNum.sort();
    
    cout << "Lista ordenada " << endl;

    for( auto i : lisNum)
        cout << i << endl;

    return 0;
}

    
