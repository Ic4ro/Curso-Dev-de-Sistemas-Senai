programa {
  funcao inicio() {
    // Declarando Variáveis.
    real rendaMensal, valorEmprestimo, prestacao
    inteiro numPrestacoes
    
    //Solicitando Informações para Usuário.
    escreva("Digite a renda mensal do solicitante: ")
    leia(rendaMensal)
    
    escreva("Digite o valor total do empréstimo solicitado: ")
    leia(valorEmprestimo)
    
    escreva("Digite o número de prestações que o solicitante deseja pagar: ")
    leia(numPrestacoes)
    
    //Calculando Informações do Usuário.
    
    prestacao = valorEmprestimo / numPrestacoes
    
    se (valorEmprestimo <= 10 * rendaMensal) {
    se (prestacao <= 0.3 * rendaMensal) 
    {
    escreva("O empréstimo pode ser concedido.")
    }
    senao
    {
    escreva("O empréstimo não pode ser concedido, pois o valor da prestação excede 30% da renda mensal do solicitante.")
    }
    }
    
    
    
  }
}