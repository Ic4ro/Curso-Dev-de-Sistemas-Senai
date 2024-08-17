
#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main() {
	setlocale (LC_ALL, "");
	
	//Declarando Variáveis.
	char disciplinas[3][200];
    	float notas[2][3], media[4], soma = 0;
	int i, j;
	
	
	
	printf("===Solicitando Dados Para Usuário === \n");
	for(i = 0; i < 3; i++) {
		printf("Digite o nome da %iº disciplina: ", i+1);
		scanf("%s", &disciplinas[i]);
		
	for (j = 0; j < 2; j++) {
	printf("Digite a %iª nota: ", j + 1);
			scanf("%f", &notas[i][j]);
		
			soma += notas[i][j];
	}
		
	media[i] = soma / 2;
	soma = 0;
		
	printf("\n");
		
	}
			
	printf("\n === Exibndo dados para o usuário === \n");	
	for (i = 0; i < 3; i++) {
		printf("%dº disciplinas: %s \n", i+1, disciplinas[i]);
			
	for (j = 0; j < 2; j++) {
		printf("%dª nota: %.1f \n", j+1, notas[i][j]);
	}
	printf("Média: %.1f\n", media[i]);
	printf("\n");
		
			
	}
		
	
	return 0;
	
}
