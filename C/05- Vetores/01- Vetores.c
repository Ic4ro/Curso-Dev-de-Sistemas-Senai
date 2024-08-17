#include <stdio.h>
#include <locale.h>
#include <stdlib.h>


int main () {
	setlocale(LC_ALL, "");

	//Declarando Variáveis.
	int numeros[5];

	//Solicitando Dados Para o Usuário.
	numeros[0] = 1;
	numeros[1] = 2;
	numeros[2] = 3;
	numeros[3] = 4;
	numeros[4] = 5;

	//Exibindo Dados Para Usuário.
	printf("Numeros 1: %d\n", numeros[0]);
	printf("Numeros 2: %d\n", numeros[1]);
	printf("Numeros 3: %d\n", numeros[2]);
	printf("Numeros 4: %d\n", numeros[3]);
	printf("Numeros 5: %d\n", numeros[4]);
	
	
	
	return 0;
	
}