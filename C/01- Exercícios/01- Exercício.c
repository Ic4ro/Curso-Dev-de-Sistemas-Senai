#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "portuguese");
	
	
	// Declarando Variáveis.
	float primeiroNumero, segundoNumero;
	float soma, subtracao, multiplicacao, divisao;
	
	// Solicitando Dados Do Usuário.
	printf("Digite o Primeiro Número: ");
	scanf("%f",&primeiroNumero);
	
	printf("Digite o Segundo Numero: ");
	scanf("%f",&segundoNumero);
	
	//Calculando Dados Do Usuário.
	soma = primeiroNumero + segundoNumero;
	subtracao = primeiroNumero - segundoNumero;
	multiplicacao = primeiroNumero * segundoNumero;
	divisao = primeiroNumero / segundoNumero;
	
	//Exibindo Dados Para Usuário.
	system("cls || clear");
	printf("=== Exibindo Dados Para Usuário ===\n");
	printf("Primeiro Número: %.1f \n", primeiroNumero);
	printf("Segundo Número: %.1f \n", segundoNumero);
	printf("Soma = %.1f \n", soma);
	printf("Subutração = %.1f \n", subtracao);
	printf("Multiplicação = %.1f \n", multiplicacao);
	printf("Divisão = %.1f \n", divisao);
	
	return 0;
	 
	
	
	
	
	
}