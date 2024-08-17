#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <time.h>

int main () {
	setlocale(LC_ALL, "");
	
	char login[] = "user";
	char senha[] = "senha123";
	char loginDigitado[20], senhaDigitada[15];
	
	int i;
	
	for (i=1; i<=3; i++) {
		printf("Digite o login: ");
		scanf("%s",&loginDigitado);
		
		printf("Digite a senha: ");
		scanf("%s",&senhaDigitada);
		
		system("cls||clear");
		if (strcmp(loginDigitado, login) == 0 && strcmp(senhaDigitada, senha) == 0) {
		    printf("Acesso concedido!");
		    break;
	    } else {
	    	printf("Acesso negado!");
	    	sleep(1);
	    	system("cls||clear");
		}
	    
	}
	
	
 return 0;	
}