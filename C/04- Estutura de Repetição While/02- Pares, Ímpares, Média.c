#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    
    int maior, menor;
    int valor, somaGeral = 0, somaPares = 0, contadorGeral = 0;
    int pares = 0, impares = 0;
    float mediaGeral, mediaPares;
   
    printf("Digite um número: ");
    scanf("%i",&valor);
   
    maior = valor;
    menor = valor;
   
    while (valor != 0) {
        if (valor > 0) {
            contadorGeral++;
            somaGeral += valor;
           
            if (valor % 2 == 0) {
                // pares = pares + 1;
                pares++;
               
                //somaPares = somaPares + valor;
                somaPares += valor;
            } else {
                impares++;
            }
        }        
            printf("Digite um número: ");
            scanf("%i",&valor);
            
            if (valor > maior) {
		        maior = valor;
        	} 
			
			if (valor > 0 && valor < menor) {
		        menor = valor;
	        }
    }
   
    if (contadorGeral == 0) {
        printf("Não foi informado um número positivo.");
    } else {
        // cast
        // 2 -> 2.0
        mediaGeral = somaGeral / (float) contadorGeral;
        mediaPares = somaPares / (float) pares;
       
        system("cls||clear");
        printf("=== Exibindo resultados ===\n");
        printf("Quantidade de pares: %i \n", pares);
        printf("Quantidade de ímpares: %i \n", impares);
        printf("Média geral: %.1f \n", mediaGeral);
        printf("Média de números pares: %.1f \n", mediaPares);
        printf("Maior valor: %i \n", maior);
        printf("Menor valor: %i \n", menor);
    }
   
    return 0;
}