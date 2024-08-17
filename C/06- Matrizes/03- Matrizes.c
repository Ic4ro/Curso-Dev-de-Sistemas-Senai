
#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main() {
	setlocale (LC_ALL, "");
	
	//Declarando Variáveis.
	char alunos[2][200];
    float notas[2][3];
	int i, j;
	
	printf("===Solicitando Dados Para Usuário === \n");
	for(i = 0; i < 2; i++) {
		printf("Digite o nome do %iº aluno: ", i+1);
		scanf("%s", &alunos[i]);
		
	printf("\n");

	for (j = 0; j < 3; j++) {
		printf("Digite a %iª nota: ", j + 1);
		scanf("%f", &notas[i][j]);
			
		}
	}
	
		printf("\n");
			
		printf("\n === Exibndo dados para o usuário === \n");	
		for (i = 0; i < 2; i++) {
			printf("%dº aluno: %s \n", i+1, alunos [i]);
		
			
		for (j = 0; j < 3; j++) 
			printf("%dª nota: %.1f \n", j+1, notas[i][j]);
		}
		
		printf("\n");	
	
	return 0;	
}

