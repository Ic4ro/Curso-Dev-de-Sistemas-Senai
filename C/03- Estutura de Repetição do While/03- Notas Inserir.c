#include <stdio.h>
#include <locale.h>
#include <ctype.h>

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
	
		printf("Deseja Inserir Mais Uma Nota (S): ");
		scanf("%c",&resposta);
		resposta = toupper(resposta);
	
	soma += nota;
	contador++;
	
	} while (resposta != 'N');
	
	media = soma / contador;
	
	printf("=== Exibindo Resultados ===\n");
	printf("Média: %.1f \n",media);
	
	return 0;
}