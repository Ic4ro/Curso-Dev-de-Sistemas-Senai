#include <stdio.h>
#include <locale.h>


//For
//Estrutura de Repetição Decrescente C.
int main() {
	setlocale(LC_ALL, "");
	int j;
	
	printf("Números Decrescente. \n");
	for(j = 10; j >= 1 ; j--){
		printf("%d \n",j);
	}
	return 0;
}
	