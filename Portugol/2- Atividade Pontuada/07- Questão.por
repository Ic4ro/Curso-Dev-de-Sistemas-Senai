programa {
  funcao inicio() {
    // Declarando Variáveis.
    cadeia produto
    real quantidade, precoUnitario, total, desconto
    inteiro descontoPercentual
    
    // Solitando Informações do usuário.
    escreva("Digite a descrição do produto: ")
    leia(produto)
    
    escreva("Digite a quantidade adquirida: ")
    leia(quantidade)
    
    escreva("Digite o preço unitário: ")
    leia(precoUnitario)

    // Calculando Dados do Usuário.
    
    total = quantidade * precoUnitario
    
    se (quantidade <= 5) 
    {
    descontoPercentual = 2
    } senao {
    se (quantidade > 5 e quantidade <= 10)
    {
    descontoPercentual = 3
    } senao
    {
    descontoPercentual = 5
    }
    }
    
    desconto = total * (descontoPercentual / 100)

    // Exibindo Dados para usuário.
    
    escreva("\nTotal: ", total)
    escreva("\nDesconto: ", desconto)
    escreva("\nTotal a pagar: ", total - desconto)
  }
}