from models.enum.sexo import Sexo
from models.enum.setor import Setor
from models.endereco import Endereco

class Funcionario: 
    def __init__(self, id: int, nome:  str, idade: int, salario : float, sexo: Sexo, setor: Setor, cpf: str, rg: str, matricula: str, dataNascimento: str, telefone: str, email: str, endereco: Endereco) -> None:
        self.id = id
        self.nome = nome 
        self.cpf = cpf
        self.rg = rg
        self.matricula = matricula
        self.dataNascimento = dataNascimento
        self.idade = idade
        self.salario = salario
        self.sexo = sexo
        self.setor = setor
        self.telefone = telefone
        self.email = email
        self.endereco = endereco

    def __str__(self) -> str:
        return (
                f"Id: {self.id}"
                f"\nNome: {self.nome}"
                f"\nCPF: {self.cpf}"
                f"\nRG: {self.rg}"
                f"\nMatrícula: {self.matricula}"
                f"\nData de Nascimento: {self.dataNascimento}"
                f"\nSexo: {self.sexo.nome}"
                f"\nSetor: {self.setor.value}"
                f"\nSalário: {self.salario} R$"
                f"\nTelefone: {self.telefone}"
                f"\nEmail: {self.email}"
                f"\n=== Endereço ===: {self.endereco}"
                )    
