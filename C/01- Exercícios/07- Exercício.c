#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "portuguese");
	
	//Declarando Variáveis. 
	float primeiraNota, segundaNota, terceiraNota;
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
	
	
	//Calculando Dados Do Usuário.
	soma = primeiraNota + segundaNota + terceiraNota;
	media = soma / 3;
	
	
	//Exibindo Dados Para Usuário.
	system("cls || clear");
	printf("=== Exibindo Dados Para Usuário ===\n");
	printf("Nome: %s \n", nome);
	printf("Idade: %i \n\n", idade);
	printf("Primeira Nota: %.1f \n", primeiraNota);
	printf("Segunda Nota: %.1f \n", segundaNota);
	printf("Terceira Nota: %.1f \n\n", terceiraNota);
	printf("Media: %.1f \n", media);
	
	if (media < 7){
		printf("Reprovado.");
	} else {
		printf("Aprovado.");
	}
	return 0;
}