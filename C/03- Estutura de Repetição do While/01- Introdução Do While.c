#include <stdio.h>
#include <locale.h>


int main() {
	setlocale(LC_ALL, "");
	//Variavéis
	float nota;
	
	do {
	    printf("Digite a Nota do Aluno: ");
	    scanf("%f",&nota);
	} while (nota <0 || nota >10 );
	
	printf("===\n Exibindo Nota ===\n");
	printf("Nota: %.1f \n", nota);
	
	return 0;
}