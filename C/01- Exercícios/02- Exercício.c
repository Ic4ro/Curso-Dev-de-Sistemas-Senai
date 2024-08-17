#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "portuguese");
	
	//Declarando Variáveis. 
	float primeiraNota, segundaNota, terceiraNota, quartaNota;
	float soma, media;
	char nome[200]; 
	int idade;
	
	// Solicitando Dados Do Usuário.
	
	printf("Digite Seu Nome: ");
	scanf("%s",&nome);
	
	printf("Digite Sua Idade: ");
	scanf("%i",&idade);
	
	printf("Digite a Primeira Nota: ");
	scanf("%f",&primeiraNota);
	
	printf("Digite a Segunda Nota: ");
	scanf("%f",&segundaNota);
	
	printf("Digite a Terceira Nota: ");
	scanf("%f",&terceiraNota);
	
	printf("Digite a Quarta Nota: ");
	scanf("%f",&quartaNota);
	
	//Calculando Dados Do Usuário.
	soma = primeiraNota + segundaNota + terceiraNota + quartaNota;
	media = soma / 4;
	
	
	//Exibindo Dados Para Usuário.
	system("cls || clear");
	printf("=== Exibindo Dados Para Usuário ===\n");
	printf("Nome: %s \n", nome);
	printf("Idade:  %i \n\n", idade);
	printf("Primeira Nota: %.1f \n", primeiraNota);
	printf("Segunda Nota: %.1f \n", segundaNota);
	printf("Terceira Nota: %.1f \n", terceiraNota);
	printf("Quarta Nota: %.1f \n", quartaNota);
	printf("Media: %.1f \n", media);
	
	return 0;
}