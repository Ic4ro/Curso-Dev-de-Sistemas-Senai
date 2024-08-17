
programa {
  funcao inicio() {
    inteiro diaDaSemana  

    escreva("Digite um número para o dia da semana: ")
    leia(diaDaSemana)

    escolha(diaDaSemana){
        caso 1:
        escreva("\nDomingo \nFinal de Semana.") 
        pare
        caso 2:
        escreva("\nSegunda \nDia útil.")
        pare
        caso 3:
        escreva("\nTerça \nDia útil.")
        pare
        caso 4:
        escreva("\nQuarta \nDia útil.")
        pare
        caso 5:("\nQuinta \nDia útil")
        pare
        caso 6:("\nSexta \nDia útil")
        pare 
        caso 7:("\nSabádo\nFinal de Semana.")
        pare
        caso contrario:
        escreva("Opção inválida.")
        

    }  
  }
}