programa {
  funcao inicio() {
    //Declarando variaveis.
    inteiro valorA, valorB, soma, multipicacao, resultado, valorC


    //Solicitando valores do usuário. 
    escreva("Digite o valor A: ")
    leia(valorA)

    escreva("Digite valor B: ")
    leia(valorB)

    
    //calculando valores do usuário.
    soma = valorA + valorB 
    multipicacao = valorA * valorB


    se( valorA == valorB) {
      soma = valorA + valorB 
      resultado =  valorA + valorB
    } senao{
      multipicacao = valorA * valorB 
      resultado = valorA * valorB
    }

    //Exibindo dados para usuário.
    limpa()
    escreva("\n====Exibindo Valores Para o Usuário====")
    escreva("\nValor A: ", valorA)
    escreva("\nValor B: ", valorB)
    escreva("\nResultado: ",resultado)
    

  }
}