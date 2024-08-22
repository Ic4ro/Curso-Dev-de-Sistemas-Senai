
package com.mycompany.mavenproject7;

public class Principal {

    public static void main(String[] args) {
        Medico medico1 = new Medico("21312", "055.055.055-57", "595959", "595959", Setor.SAUDE, 1500, Sexo.MASCULINO, EstadoCivil.CASADO, "17/07/2000", "Amanda", "0719885578", "Amanda@gmail.com",
                new Endereco("Rua A", "2888", "1 Andar", "4115-555", "Salvador", UnidadeFederativa.BAHIA));
        Advogado advodado1 = new Advogado("123123", "5151515", "545454", "131312", Setor.JURIDICO, 5000, Sexo.MASCULINO, EstadoCivil.SOLTEIRO, "17/07/2000", "Icaro", "0719888787", "icaro@gmail.com",
                new Endereco("Rua B", "288", "1 Andar", "45656", "Rio de janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Engenheiro engenheiro1 = new Engenheiro("1312321", "555.555.555-44", "213123", "131312", Setor.ENGENHARIA, 7500, Sexo.MASCULINO, EstadoCivil.VIUVO, "14/08/2000", "João", "071988788", "joao123@gmail.com",
                new Endereco("Rua C", "2666", "3 Andar", "0719887755", "São paulo", UnidadeFederativa.SAO_PAULO));
        Fornecedor fornecedor1 = new Fornecedor("Carne", "545995", "595959", "João", "07198777887", "ii@gmail.com",
                new Endereco("Rua A", "2888", "1 Andar", "6544-444", "Salvador", UnidadeFederativa.BAHIA));               
        PrestacaoServico prestacaoservico1 = new PrestacaoServico("17/07/2010", "17/07/2015", "595959", "59595", "Ana", "0719788787", "anda@gmail.com", 
                new Endereco("Rua B", "288", "2 Andar", "544444", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(medico1.toString());
        System.out.println(advodado1.toString());
        System.out.println(engenheiro1.toString());
        System.out.println(fornecedor1.toString());
        System.out.println(prestacaoservico1.toString());
    
    
    }
}

    
