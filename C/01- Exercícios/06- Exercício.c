#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() { 
    setlocale(LC_ALL,"");
	
    // Declarando Variáveis
    float valor, desconto, valorFinal;
	
    // Solicitando Dados Para Usuário.
    printf("Digite um Valor: ");
    scanf("%f", &valor);
	
    // Calculando Dados Para Usário.
    desconto = valor * 0.1; 
    valorFinal = valor - desconto;
	
    // Exibindo Dados Para Usuário.
    system("cls || clear");
    printf("\n=== Exibindo Resultados ===\n");
    printf("Valor: %.2f \n", valor);
    printf("Desconto: %.2f \n", desconto);
    printf("Valor Final: %.2f\n", valorFinal);
	
    return 0;
}