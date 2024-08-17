
#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <limits.h>
#define TAM 10


int main () {
	setlocale(LC_ALL, "");
	
	//Declarando Variáveis.
	float soma = 0;
	float numerosReais[TAM];
	int numerosPositivos, numerosNegativos;
	int i;
	
	
	//Solicitando Dados Para o Usuário.
	printf("Digite os numeros:\n");
	for (i = 0; i < TAM;i++) {
		printf("numeros %d: ", i + 1);
		scanf("%f", &numerosReais[i]); 
	
	
	if (numerosReais[i] < 0){
		numerosNegativos++;	
	} else if (numerosReais[i] > 0) {
		numerosPositivos++;
		soma += numerosReais[i];
		}
		
}
  
  	//Exibindo Dados Para Usuário.
	printf("\nExibindo as notas informadas: \n");
	for (i = 0;i < TAM; i++) {
	printf("%i° Números: %.1f\n", i+1, numerosReais[i]);
	}
  
  
  printf("\nQuantidade de números negativos: %i \n",numerosNegativos);
  printf("Soma de Números Positivos: %.1f\n", soma);
  
  
  return 0;	
}
