#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	//Declarando Variáveis.
	char disciplina[3] [200];
	float nota[3][2], media[3], soma = 0;
	int i, j; 
	
	//Solicitando dados para usuário.
	printf("===Solicitando Dados Para Usuário === \n");
	for(i = 0; i < 3; i++) {
	printf("Digite o nome da %iª disciplina: ", i+1);
	scanf("%s", &disciplina[i]);
		
	for (j = 0; j < 2; j++) {
	printf("Digite a %iª nota: ", j + 1);
	scanf("%f", &nota[i][j]);
		
	soma += nota[i][j];
	}
	media[i] = soma / 2;
	soma = 0;
		
		
	}
	//Exibindo dados para usuário.
	printf("\n === Exibindo dados para o usuário === \n");	
	for (i = 0; i < 3; i++) {
		printf("%dª disciplinas: %s \n", i+1, disciplina[i]);
			
	for (j = 0; j < 2; j++) {
		printf("%dª nota: %.1f \n", j+1, nota[i][j]);
	}
	printf("Média: %.1f\n", media[i]);
	
		
	if (media[i] >= 7){
		printf("Aprovado.\n\n");
		
	}	else if (media[i] >=5)
		printf("Recuperação.\n\n");
		
		else {
		printf("Reprovado.\n\n");
	}
			
  }

	
  return 0;

}
