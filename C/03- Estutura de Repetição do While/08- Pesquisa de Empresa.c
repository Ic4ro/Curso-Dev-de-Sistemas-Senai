#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

int main() {
	setlocale(LC_ALL, "");
    char nome[250];
    int idade;
    char email[250];
    int telefone;
    int opcao;
    
    printf("Digite seu nome: ");
    scanf("%s", &nome);
    printf("Digite sua idade: ");
    scanf("%d", &idade);
    printf("Digite seu email: ");
    scanf("%s", &email);
    printf("Digite seu telefone: ");
    scanf("%d", &telefone);

    do {
        printf("\n========Menu========:\n");
        printf("1- Mostrar nome e idade\n");
        printf("2- Mostrar nome e e-mail\n");
        printf("3- Mostrar nome e telefone\n");
        printf("4- Mostrar todas as informações\n");
        printf("0- Sair do programa\n");
        printf("\nEscolha uma opção: ");
        scanf("%d",&opcao);

        switch(opcao) {
            case 1:
                printf("Nome: %s\n", nome);
                printf("Idade: %d\n", idade);
                sleep(3);
                break;
            case 2:
                printf("Nome: %s\n", nome);
                printf("E-mail: %s\n", email);
                sleep(3);
                break;
            case 3:
                printf("Nome: %s\n", nome);
                printf("Telefone: %d\n", telefone);
                sleep(3);
                break;
            case 4:
                printf("Nome: %s\n", nome);
                printf("Idade: %d\n", idade);
                printf("E-mail: %s\n", email);
                printf("Telefone: %d\n", telefone);
                sleep(3);
                break;
            case 0:
                printf("Saindo do programa...\n");
                sleep(3);
                break;
            default:
                printf("Opção incorreta, tente novamente.\n");
                sleep(3);
                break;
            }

    		} while(opcao != 0);

    
    	return 0;
	
}

		

