programa {
  funcao inicio() {
    inteiro valorA, valorB, resultado
    caracter operacao

    // Solicitar os valores de A e B ao usuário.
    escreva("Digite o valor de A: ")
    leia(valorA)
    escreva("Digite o valor de B: ")
    leia(valorB)

    // Solicitar a operação ao usuário
    escreva("Digite a operação desejada (+, -, *, /): ")
    leia(operacao)

    // Realizar a operação de acordo com o código inserido.
    escolha (operacao){ 
    caso  "+":
    resultado = valorA + valorB
    pare
    caso "-":
    resultado = valorA - valorB
    pare
    caso "*": 
    resultado = valorA * valorB
    pare
    caso "/":
    resultado = valorA / valorB
    pare
    caso contrario:  
    escreva("A operação digitada é inválida!")
    }

      

    // Exibir o resultado da operação.
    limpa()
    escreva("\n====Exibindo Dados Para Usuário====")
    escreva("\nValor A: ", valorA)
    escreva("\nValor B: ", valorB)
    escreva("\nOperação: ", operacao)
    escreva("\nO resultado da operação é: ", resultado)


    
  }
}