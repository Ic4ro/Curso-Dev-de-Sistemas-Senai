
package com.mycompany.mavenproject7;

public class Fornecedor extends Juridica{
    private String produto;

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
   
}
