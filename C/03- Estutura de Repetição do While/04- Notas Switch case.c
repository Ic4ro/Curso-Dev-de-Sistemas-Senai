#include <stdio.h>
#include <locale.h>
#include <ctype.h>
#include <time.h>
#include <stdlib.h>

int main() {	
	setlocale(LC_ALL, "");
	//Variavéis.
	float nota, soma = 0, media;
	int contador = 0;
	char resposta;
	
	do{
		printf("Digite Uma Nota: ");
		scanf("%f",&nota);
		
		fflush(stdin);
	
		system("cls || clear");	
		printf("Escolha uma das opções abaixo. \n");
		printf("S - Inserir Mais Uma Nota. \n");
		printf("P - Notas Inseridas. \n");
		printf("N - Média aritmética das notas informadas. \n");
		printf("Resposta: ");
		scanf("%c",&resposta);
		resposta = toupper(resposta);
		
		soma += nota;
		contador++;
		
		switch(resposta) {
		case 'S':
			system("cls || clear");	
			break;
		case 'P':
			printf("Quantidade de notas inseridas: %i  \n", contador);
			sleep(5);
			system("cls || clear");
			break;
		case 'N':
			system("cls || clear");
			break;
		default:
			printf("Opção inválida! \n");
			sleep(5);
			system("cls || clear");
		}				
	} while (resposta != 'N');

	media = soma / contador;
	
	printf("/n=== Exibindo Resultados ===\n");
	printf("Média: %.1f \n",media);
	
	return 0;
}