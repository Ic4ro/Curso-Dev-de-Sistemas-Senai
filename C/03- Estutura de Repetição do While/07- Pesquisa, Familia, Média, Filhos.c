#include <stdio.h>
#include <locale.h>
#include <limits.h>
#include <time.h>

main () {
	setlocale(LC_ALL, "");
	
	int i, opcao, filhos, mediaFilhos, somaFilhos;
	float salario, mediaSalarial, somaSalario;
	float maiorSalario = INT_MIN, menorSalario = INT_MAX;
	
	do {
		
		printf("1 - Adicionar família. \n");
		printf("2 - Sair e exibir resultados. \n");
		printf("Escolha uma opção: ");
		scanf("%i",&opcao);
		
		switch (opcao) {
		    case 1:
		    	printf("Salário total da família: ");
		    	scanf("%f",&salario);
		    	
		    	i++;
		    	somaSalario += salario ;
		    	
		    	if (salario > maiorSalario) {
		        maiorSalario = salario;
                } 
			
	            if (salario < menorSalario) {
		        menorSalario = salario;
	            }
		    	
		    	printf("Número de filhos: ");
		    	scanf("%i",&filhos);
		    	
		    	somaFilhos += filhos;

		        break;
		    case 2:
			    break;
			default:
			    printf("Opção invalida!");
				sleep(4);
				system("cls||clear"); 
	}
				
	} while (opcao != 2);
	
	mediaSalarial = somaSalario / i;
	mediaFilhos = somaFilhos / i;
	
	system("cls || clear");
	printf("=== Exibindo resultados ===\n");
	printf("Total de famílias que responderam a pesquisa: %i \n", i);
	printf("Média do salário da população: %.2f \n", mediaSalarial);
	printf("Média do número de filhos: %i \n", mediaFilhos);
	printf("Maior salário: %.2f \n", maiorSalario);
	printf("Menor salário: %.2f \n", menorSalario);
	
	
 return 0;
}