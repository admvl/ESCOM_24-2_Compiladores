#include <stdlib.h>
#include <stdio.h>

int main() {
    int i, total;
    int suma();
    
    i = 0;
    total = 0;
    
    suma();
    printf("%i \n", suma());
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
