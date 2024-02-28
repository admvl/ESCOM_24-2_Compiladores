#include <iostream>
#include <cstring>

using namespace std;

void mystrcat(char *s1, char *s2, int len = -1);

int main() {
    char str1[80] = "Es una prueba";
    char str2[80] = "0123456789";
    
    mystrcat(str1, str2, 5); // concatena 5 caracteres
    cout << str1 << '\n';
    strcpy(str1, "Es una prueba"); // resetea str1
    
    mystrcat(str1, str2); // concatena toda la cadena
    cout << str1 << '\n';
    
    return 0;
}

void mystrcat(char *s1, char *s2, int len) {
    // Encontrar el final de s1
    while(*s1) s1++;
    
    if(len == -1) len = strlen(s2);
    
    while(*s2 && len) {
        *s1 = *s2; // copia los caracteres
        s1++;
        s2++;
        len--;
    }
    *s1 = '\0'; // termina s1 con un null
}
