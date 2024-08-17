#include <stdio.h>
#include <locale.h>


int main() {
	setlocale(LC_ALL, "");
    int i = 10;
    
    printf("Contando de 10 a 1:\n");
    while (i >= 1) {
        printf("%d \n", i);
        i--;
    }
    
    return 0;
}