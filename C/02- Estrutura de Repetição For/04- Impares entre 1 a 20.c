#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	int i; 
		
	printf("Mostrando os Números Ímpares Entre 1 e 20:\n");	
	for(i = 1; i <=20; i++) {
		if (i % 2 == 1) {
			printf("%d \n", i);
		}
	 
	}
	
	return 0;		
}