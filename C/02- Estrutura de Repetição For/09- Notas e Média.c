#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	float notas,soma, media; 
	int i;
	
	for(i = 1; i <= 4 ; i++) {
		printf("Digite a %i° nota: ", i);
		scanf("%f", &notas);	
		
		soma = soma + notas;
	}
	 
	media = soma /4;
	
	printf("\n=== Exibindo Resultados ===\n"); 	
	printf("Média: %.1f \n", media);
		
	return 0;
}