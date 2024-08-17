programa {
  funcao inicio() {
    caracter sexo
    real altura, pesoIdeal

    escreva("Digite o seu sexo: ")
    leia (sexo)
    
    escreva("Qual sua altura: ")
    leia(altura)

    escolha(sexo){
      caso 'M':
      pesoIdeal = (72.5 * altura) - 58
      pare
      caso'F':
      pesoIdeal = (62.1 * altura) - 47.5
      pare
      caso contrario:
      pesoIdeal = 0
    }
    limpa()
    escreva("==== Exibindo Resultados ====")
    escreva("\nPeso ideal: ", pesoIdeal)
  } 

}