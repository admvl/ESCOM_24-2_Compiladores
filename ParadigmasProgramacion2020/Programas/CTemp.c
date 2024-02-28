#include <stdlib.h>
#include <stdio.h>

int main() {
    float fa, ce;
    float celsius(float fa);
    
    cout << "Escribir la temperatura en grados fahrenheit:" << " " << endl;
    cin >> fa;
    
     ce = (5.0/9.0)*(fa - 32.0);
   
    
    cout << "La temperatura en celsius, es:" << " " << ce << endl;

    return 0;
}

