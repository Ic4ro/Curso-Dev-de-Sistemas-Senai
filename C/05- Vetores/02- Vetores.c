
#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#define TAM 5


int main () {
	setlocale(LC_ALL, "");
	
	//Declarando Variáveis.
	int vetor[TAM];
	int i;
	
	//Solicitando Dados Para o Usuário.
	printf("Digite os elementos do vetor:\n");
	for (i = 0; i < TAM;i++) {
		printf("Elemento %d: ", i + 1);
		scanf("%d", &vetor[i]);
		
	}
	

	//Exibindo dados de um vetor em um laço de repetição.
	printf("\nExibindo os elementos do vetor: \n");
	for (i = 0;i < TAM; i++) {
		printf("Elemento %d: %d\n", i+1, vetor[i]);
	}

	
  return 0;
  
  }
