#include <stdio.h>
#include <locale.h>
#include <ctype.h>
#include <stdio.h>
#include <time.h>

int main() {	
	setlocale(LC_ALL, "");
	//Variavéis.
	float media;
	int valores = 1, soma = 0, contador = 0;
	
	
	while(valores > 0) {
		printf("Digite Um Valor: ");
		scanf("%i",&valores);
	
		if (valores > 0) {
			soma += valores;
			contador++;
		}		
	}
		media = soma / (float) contador;
			
		
	printf("\n=== Exibindo Resultados ===\n");
	if (contador == 0) {
		printf("Não Foram Inseridos Números Positivos. \n");
		sleep(3);
	} else {
		printf("Média: %.1f \n", media);
	}
	} 
	