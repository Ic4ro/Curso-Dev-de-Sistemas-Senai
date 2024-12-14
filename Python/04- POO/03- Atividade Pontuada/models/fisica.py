from models.pessoa import Pessoa
from models.enum.sexo import Sexo


class Fisica(Pessoa):
    def __init__(self, nome, telefone, email, endereco, cpf: str, rg: str, data_nascimento: str, sexo: Sexo) -> None:
        super().__init__(nome, telefone, email, endereco)
        self.cpf = cpf
        self.rg = rg
        self.data_nascimento = data_nascimento
        self.sexo = sexo

    def __str__(self) -> str:
        return (f"{super().__str__()}" 
                f"\nCPF: {self.cpf}"
                f"\nRG: {self.rg}"
                f"\nData de Nascimento: {self.data_nascimento}"
                f"\nSexo: {self.sexo.texto} | {self.sexo.caractere}"
                )