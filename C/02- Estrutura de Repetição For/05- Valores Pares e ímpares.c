#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
setlocale(LC_ALL, "");
	int i, numero, pares = 0, impares = 0; 
	
	//Solicitando Dados Para o Usuário.
	for(i = 1; i <= 5 ; i++) {
		printf("Digite o %i número: ", i);
		scanf("%i", &numero);	
	
	if (numero % 2 == 0) {
		pares++;
	} else { 
		impares++;
	}	
}
printf("====\n Exibindo Resultados ====\n");
printf("Pares: %i\n", pares);
printf("Ímpares: %i\n", impares);
	

return 0 ;	
}