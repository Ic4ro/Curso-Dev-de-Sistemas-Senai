#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){ 
	setlocale(LC_ALL,"");
	//Declarando Variáveis.
	float salario;
	int salariosMinimos;
	
	//Solicitando Dados Para o Usuáro.
	printf("Digite Seu Salário: ");
	scanf("%f",&salario);
	
	//Calculando Dados Para o Usuário.	
	salariosMinimos = salario / 1412.00;
	
	//Exibindo Dados Para o Usuário.
	system("cls || clear");
	printf("\n=== Exibindo Resultados ===\n");
	printf("Salário: %3.f \n",salario);
	printf("Salários Mínimos: %i \n",salariosMinimos);
	
	return 0;


}