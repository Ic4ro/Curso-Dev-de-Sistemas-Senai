programa {
  funcao inicio() {
    //Declarando variaveis.
    cadeia nome, estadoCivil
    inteiro tempoDeCasada
    caracter sexo

    //Solicitando dados do usuário.
    escreva("Digite seu nome: ")
    leia(nome)

    escreva("Digite seu Sexo M OU F: ")
    leia(sexo)

    escreva("Digite seu Estado Civil: ")
    leia(estadoCivil)


    //Calculando dados do usuário.

    se (sexo == 'F' e estadoCivil == "CASADA"  ){   
    escreva("Digite seu tempo de casada: ")
    leia(tempoDeCasada)
    }senao {
    escreva("SOLTEIRO")   
    }

    //Exibindo Dados do Usuário.
    limpa()
    escreva("\n====Exibindo Dados====")
    escreva("\nNome: ", nome)
    escreva("\nSexo: ",sexo )
    escreva("\nEstado Civil: ",estadoCivil)
    escreva("\nTempo de Casada: ",tempoDeCasada)
    
    
    
  }
}