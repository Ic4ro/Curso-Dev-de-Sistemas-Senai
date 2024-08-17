#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){ 
	setlocale(LC_ALL,"");
	//Declarando Variáveis.
	int numero;

	//Solicitando Dados Para Usuário.
	printf("Digite um Número: ");
	scanf("%i",&numero);

	//Exibindo Dados Para Usuário.
	printf("\n=== Exibindo Resultados ===\n");
	if (numero % 2 == 0) {
		printf("Par.");
	} else {
		printf("Ímpar.");
	}
	
	return 0;
}
