programa {
  funcao inicio() {
    // Declarando Variáveis.
    real morangos, macas, totalMorangos, totalMacas,  totalFrutas, totalPago
    inteiro desconto
    
    // Solicitando Dados Para Usuário.
    escreva("Digite a quantidade de morangos (em kg): ")
    leia(morangos)
    
    escreva("Digite a quantidade de maças (em kg): ")
    leia(macas)

    //Calculando Dados Para Usuário.
    se (morangos <= 5) 
    {
    totalMorangos = 2.5 * morangos
    } senao
    {
    totalMorangos = 2.2 * morangos
    }
    se (macas <= 5) 
    {
    totalMacas = 1.8 * macas
    } senao
    {
    totalMacas = 1.5 * macas
    }
    totalFrutas = totalMorangos + totalMacas
    se (morangos + macas > 8 ou totalFrutas > 25) 
    {
    totalPago = totalFrutas * 0.9
    desconto = 10
    } senao
    {
    totalPago = totalFrutas
    desconto = 0
    }
    
    // Exibindo Dados Para Usuário
    escreva("\nTotal a pagar: R$ ", totalPago)
    se (desconto > 0) 
    {
    escreva("\nDesconto: ", desconto, "%")
    }
    
  }
}