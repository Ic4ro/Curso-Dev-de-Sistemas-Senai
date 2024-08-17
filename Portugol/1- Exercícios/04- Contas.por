programa {
  funcao inicio() {
    // Declaração de variáveis.
    real primeiroNumero, segundoNumero
    real soma, subtracao, multiplicacao, divisao

    // Solicitando dados para o usuário.
    escreva("Digite o primero número: ")
    leia(primeiroNumero) 

    escreva("Digite o segundo número: ")
    leia(segundoNumero)

    // Realizar cálculos.
    soma = primeiroNumero + segundoNumero
    subtracao =  primeiroNumero - segundoNumero
    multiplicacao = primeiroNumero * segundoNumero
    divisao = primeiroNumero / segundoNumero

    // Exibindo resultados para o usuário.
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nPrimeiro número: ", primeiroNumero)
    escreva("\nSegundo número: ", segundoNumero)
    escreva("\nSoma = ", soma)
    escreva("\nSubtração = ", subtracao)
    escreva("\nMultiplicação = ", multiplicacao)
    escreva("\nDivisão = ", divisao)
  }
}