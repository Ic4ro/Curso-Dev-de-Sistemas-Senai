#include <stdio.h>
#include <locale.h>
#include <string.h>

int main() {	
	setlocale(LC_ALL, "");
	//Variavéis
	char resultado[200];
	float nota, soma, media; 
	int i;
	
	for(i = 1; i <= 3; i++) {
	do {
		printf("Digite a %i° nota: ", i);
		scanf("%f", &nota);
	} while (nota <0 || nota >10 );
		
		soma += nota;
		
	}
	
	media = soma / 3;
	
		if(media >=7){
		strcpy(resultado, "Aprovado!");
	} else if(media >=5) {
		strcpy(resultado, "Recuperação!");
	} else {
		strcpy(resultado, "Reprovado!");
	}
	
	printf("===\n Exibindo Nota ===\n");
	printf("Média: %.1f \n", media);
	printf("Resultado: %s \n", resultado);	
	
	
	
	return 0;
}