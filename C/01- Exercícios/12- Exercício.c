
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int main(){ 
	setlocale(LC_ALL,"");
	
	//Declarando Variáveis.
	char nomeAluno[200], resultado[200];
	char conceito;
	float primeiraNota, segundaNota, media;
	
	//Solicitando Dados do Usuário.
	printf("Digite o Nome do Aluno: ");
	scanf("%s",&nomeAluno);
	
	printf("Digite a Primeira Nota do Aluno: ");
	scanf("%f",&primeiraNota);
	
	printf("Digite a Segunda Nota do Aluno: ");
	scanf("%f",&segundaNota);
	
	//Calculando Dados Do Usuário.
	media = ( primeiraNota + segundaNota) / (float) 2;
	
	//Exibindo Resultados.
	if(media >= 9) {
		conceito = 'A';
	}
	else if(media >= 7.5){
		conceito = 'B';
	}
	else if(media >= 6 && media <7.5){
		conceito = 'C';
	}
	else if(media >= 4 && media < 6){
		conceito = 'D';
	}
	else if(media < 4){
		conceito = 'E';
	}
	
	if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
		strcpy(resultado, "Aprovado");
	} else {
		strcpy(resultado, "Reprovado");
	}	
	
	system("cls || clear");
	
	printf("\n=== Exibindo Resultados ===\n");
	printf("Nome: %s \n", nomeAluno);
	printf("Primeira Nota: %.1f \n", primeiraNota);
	printf("Segunda Nota: %.1f \n\n", segundaNota);
	printf("Média: %.1f \n", media);
	printf("Conceito: %.1c \n", conceito);
	printf("Resultado: %.1s \n", resultado);
	
	getchar();
	return 0;
	}
