#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){ 
	setlocale(LC_ALL,"");
	
	//Declarando Variáveis.
	int qntMaca;
	float precoMaca, custoTotal, desconto;
	
	//Solicitando Dados Para Usuário.
	printf("Digite a Quantidade de Maçãs: ");
	scanf("%i",&qntMaca);
	
	
	
	if 	(qntMaca < 12 ) {
		precoMaca = 1.30;
	} else {
		precoMaca = 1.0;
	}
	
	custoTotal = precoMaca * qntMaca;
		//Exibindo Valores.
	
	system("cls || clear");
	printf("=== Exibindo Dados Para Usuário ===\n");
	printf("Quantidade Maçãs: %i \n" , qntMaca);
	printf("Preco Maçã: %.2f \n" , precoMaca);
	printf("Custo total: %.2f \n" , custoTotal);
	
	
	return 0;
}