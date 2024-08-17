#include <stdio.h>
#include <locale.h>
#include <string.h>

int main() {
	setlocale(LC_ALL, "");
	//Variavéis
	char resultado[200];
	float notas, soma, media; 
	int i;
	
	//Solicitando Notas Para Usuário.
	for(i = 1; i <= 3; i++) {
		printf("Digite a %i° nota: ", i);
		scanf("%f", &notas);	
		
		//soma = soma + nota;
		soma += notas;
	}
	
	media = soma /3;
	
	//Mostrando Notas Para Usuário.
	if(media >=7){
		strcpy(resultado, "Aprovado!");
	} else if(media >=4) {
		strcpy(resultado, "Recuperação!");
	} else {
		strcpy(resultado, "Reprovado!");
	}
		
	printf("\n=== Exibindo Resultados ===\n"); 	
	printf("Média: %.1f \n", media);
	printf("Resultado: %s \n", resultado);	
		
	return 0;
}