#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
    int i = 0;
    
    printf("Números pares entre 1 e 20:\n");
    while (i <= 20) {
        if (i % 2 == 0) {
            printf("%d \n", i);
        }
        i++;
    }
    
    return 0;
}