#include <stdio.h>

int main() {
    char word[10];
    int i = 0;
    
    while (scanf("%9s", word) == 1) {
        i = i + 1;
        
        if (i % 2)
            printf("Es par %s\n", word);
        else
            printf("Es impar %s\n", word);
    }
    return 0;
}
