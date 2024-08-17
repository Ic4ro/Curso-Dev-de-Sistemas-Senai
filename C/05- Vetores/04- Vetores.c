
#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#define TAM 3


int main () {
	setlocale(LC_ALL, "");
	
	//Declarando Variáveis.
	float notas[TAM], media, soma = 0;
	int i;
	
	//Solicitando Dados Para o Usuário.
	printf("Digite as notas: \n");
	for (i = 0; i < TAM;i++) {
		printf("Notas %d: ", i + 1);
		scanf("%f", &notas[i]);
		
		soma += notas[i];
	}
	
	media = soma / TAM;
	
	//Exibindo dados de um vetor em um laço de repetição.
	printf("\nExibindo as notas informadas: \n");
	for (i = 0;i < TAM; i++) {
		printf("Notas %d: %.1f\n", i+1, notas[i]);
	}
	printf("\nMédia: %.2f\n", media);
	
	return 0;
}
