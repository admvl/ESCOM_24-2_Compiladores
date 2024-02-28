#include <stdlib.h>
#include <stdio.h>

int main() {
    float fa, ce;
    float celsius(float fa);
    
    printf("Escribir la temperatura en grados fahrenheit:");
    scanf("%f", &fa);
    
    float celsius(float fa);
    
    printf("La temperatura en celsius, es: %f", ce);

    return 0;
}

float celsius(float) {
    float ce,fa;
    
    ce = (5.0/9.0)*(fa - 32.0);
    
    return ce;
}
