programa {
  funcao inicio() {
    //Declarando Variáveis. 
    real primeiraNota, segundaNota, media 

    //Solicitando Notas para Usuário.
    escreva("Digite Sua Nota 1 (Use ponto ao invés de vírgula): ")
    leia(primeiraNota)

    escreva("Digite Sua Nota 2 (Use ponto ao invés de vírgula): ")
    leia(segundaNota)
    
    //Calculando Notas do usuário. 

    media =(primeiraNota + segundaNota ) /2
    se (media >= 6.0) { 
    escreva("\nPARABÉNS VOCÊ ESTÁ APROVADO")
    }senao se (media >= 4.0) { 
    escreva("\nVOCÊ ESTÁ DE RECUPERAÇÃO")
    }senao {
    escreva("\nVOCÊ ESTÁ REPROVADO")
    }



  //Exibindo resultados para usuário.
  escreva("\nMédia: ", media)
    
    


  }
}