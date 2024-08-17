#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	int i, numero, soma = 0; 

	//Solicitando Dados Para o Usuário.
	for(i = 1; i <= 5 ; i++) {
	
		printf("Digite o %i número: ", i);
		scanf("%i", &numero);	
	
		soma += numero;
	}
	
	printf("Soma: %i\n",soma);
	
	return 0;
	}
	