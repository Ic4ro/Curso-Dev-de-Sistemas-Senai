from models.enum.sexo import Sexo
from models.enum.setor import Setor

class Funcionario: 
    def __init__(self, id: int, nome:  str, idade: int, salario : float, sexo: Sexo, setor: Setor) -> None:
        self.id = id
        self.nome = nome 
        self.idade = idade
        self.salario = salario
        self.sexo = sexo
        self.setor = setor

    def __str__(self) -> str:
        return (
                f"Id: {self.id}"
                f"\nNome: {self.nome}"
                f"\nIdade: {self.idade} Anos"
                f"\nSalário: {self.salario} R$"
                f"\nSexo: {self.sexo.value}"
                f"\nSetor: {self.setor.value}"
                )    