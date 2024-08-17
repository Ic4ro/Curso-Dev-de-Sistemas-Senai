programa {
  funcao inicio() {
    // Declaração de variáveis.
    real base, altura, area
   

    // Solicitando dados para o usuário.
    escreva("Digite a base: ")
    leia(base)

    escreva("Digite a altura: ")
    leia(altura)

    //Realizar cálculos.
    area = (base * altura) /2 

    //Exibindo os resultados para o usuário
    limpa()
    escreva("=== Exibindo resultados ===")
    escreva("\nBase = ", base)
    escreva("\nAltura = ", altura)
    escreva("\nÁrea = ", area)


  }
}