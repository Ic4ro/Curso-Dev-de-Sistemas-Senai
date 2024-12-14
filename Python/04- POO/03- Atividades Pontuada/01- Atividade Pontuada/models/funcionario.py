from abc import ABC, abstractmethod
from models.fisica import Fisica
from models.enum.setor import Setor
from models.enum.sexo import Sexo
from models.endereco import Endereco


class Funcionario(Fisica, ABC):
    def __init__(self, nome, telefone, email, endereco: Endereco, cpf, rg, data_nascimento, sexo, matricula: str, setor: Setor, salario: float) -> None:
        super().__init__(nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo)
        self.matricula = matricula
        self.setor = setor
        self.salario = salario

    @abstractmethod
    def salario_final(self) -> float:
        pass

    def __str__(self) -> str:
        return (f"{super().__str__()}"
               f"\nMatrícula: {self.matricula}"
               f"\nSetor: {self.setor.value}"
               f"\nSalário: {self.salario}"
               f"\nSalário Final: {self.salario_final()}"
               )
