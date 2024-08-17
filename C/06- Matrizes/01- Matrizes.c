#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main() {
	setlocale (LC_ALL, "");
	
	//Declarando Variáveis.
	int numeros[2][2];
	
	numeros[0][0] = 1;
	numeros[0][1] = 2;
	numeros[1][0] = 3;
	numeros[1][1] = 4;

	
	//Exibindo Resultados.
	printf("Numeros 1: %d\n", numeros[0][0]);
	printf("Numeros 2: %d\n", numeros[0][1]);
	printf("Numeros 3: %d\n", numeros[1][0]);
	printf("Numeros 4: %d \n", numeros[1][1]);
	return 0;
} 
