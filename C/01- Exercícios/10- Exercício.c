#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){ 
	setlocale(LC_ALL,"");
	
	//Declarando Variáveis.
	int idade;
	
	//Solicitando Dados Do Usuário.
	printf("Digite Sua Idade: ");
	scanf("%i",&idade);
	
	//Exibindo Dados Para Usuário.
	
	if (idade <18 || idade >65) {
		printf("Você Não é Obrigado a Votar.");
	} else {
		printf("Você é Obrigado a Votar.");
	}
	
	return 0;
}