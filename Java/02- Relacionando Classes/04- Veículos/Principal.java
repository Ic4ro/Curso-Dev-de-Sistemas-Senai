package com.mycompany.vendas;

public class main {

    public static void main(String[] args) {
        Veiculos veiculo = new Veiculos("BR509", "Prata", 4, 10.5, 150, 5);
        Clientes cliente = new Clientes("Carlos", 18, 111222333, "Rua", 999999);
        
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Passageiros: " + veiculo.getPassageiros());
        System.out.println("Capacidade do tanque: " + veiculo.getCapacidadeTanque());
        System.out.println("Velocidade máxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("Consumo médio: " + veiculo.getConsumoMedio());
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());     
    }
}