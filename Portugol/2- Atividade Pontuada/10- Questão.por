programa {
  funcao inicio() {
    // Declarando Variáveis.
    cadeia combustivel
    real litros, precoLitro, total, desconto
    
    //Solicitando Dados Para Usuário
    escreva("Digite o tipo de combustível (A-álcool, G-gasolina): ")
    leia(combustivel)
    
    escreva("Digite a quantidade de litros vendidos: ")
    leia(litros)

    // Calculando Dados Para Usuário.
    se (combustivel == 'A' ou combustivel == 'a') 
    {  
    precoLitro = 3.79 
    se (litros <= 25)   
    { 
    total = litros * precoLitro
    desconto = total * 0.02 
    } senao
    { 
    total = litros * precoLitro
    desconto = total * 0.04
    }
    } senao
    {
    se (combustivel == 'G' ou combustivel == 'g') 
    {
    precoLitro = 6.59
    se (litros <= 25) 
    {
    total = litros * precoLitro
    desconto = total * 0.03
    } senao
    {
    total = litros * precoLitro
    desconto = total * 0.05
    }
    } senao
    {
    escreva("Tipo de combustível inválido.")        
    }
    }
    
    total = total - desconto
    // Exibindo Dados Para Usuário.
    escreva("Total a pagar: R$ ", total)
    
  }
}