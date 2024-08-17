#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){ 
	setlocale(LC_ALL,"");
	//Declarando Variáveis.
	int numero, antecessor, sucessor;
	
	//Solicitando Dados Para O Usuáro.
	printf("Digite um Número: ");
	scanf("%i",&numero);
	
	//Calculando Dados Do Usuário
	antecessor = numero - 1;
	sucessor = numero + 1;
	
	//Exibindo Dados Para usuário.
	system("cls || clear");
	printf("\n=== Exibindo Resultados ===\n");
	printf("Número: %i\n",numero);
	printf("Antecessor: %i\n",antecessor);
	printf("Sucessor: %i\n",sucessor);
	
	return 0;
	
}