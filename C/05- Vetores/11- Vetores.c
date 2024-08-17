
#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <limits.h>
#define TAM 6



int main () {
	setlocale(LC_ALL, "");
	
	//Declarando Variáveis.
	int valores[TAM], pares, positivos;
	int i;

	//Solicitando Dados Para o Usuário.
	printf("Digite os valores:\n");
	for (i = 0; i < TAM;i++) {
		do {
		
	printf("Digite os %i° valores: ", i+1);
	scanf("%d", &valores[i]); 
    } while (valores[i] < 0 || valores[i] % 2 == 1);
}
	//Exibindo Dados Para o Usuário.
	printf("\n==== Exibindo Dados Para o Usuário na orndem inversa ===\n");
	for (i = TAM - 1; i >= 0; i--) {
		printf("%i° valor: %i \n", i+1, valores[i]);	
		
	}
return 0;
 }
