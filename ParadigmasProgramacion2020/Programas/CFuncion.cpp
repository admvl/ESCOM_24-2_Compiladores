#include <iostream>

using namespace std;

int main() {
    int i, total;
    int suma();
    
    i = 0;
    total = 0;
    
    suma();
    cout << suma() << "\n";
    
        
}

int suma() {
        int i, total;
        
        i = 0;
        total = 0;
        
        while(i <= 100) {
            total = i + total;
            i++;
        }
        return total;
}
