
package com.mycompany.mavenproject1;

public class Funcionario {
    private String id;
    private String nome;
    private double salario;
    private Setor setor;        
    private int idade;
    private Sexo sexo;

    public Funcionario(String id, String nome, double salario, Setor setor, int idade, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

  
    
}
