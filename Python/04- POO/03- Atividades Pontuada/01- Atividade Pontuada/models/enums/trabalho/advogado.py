from models.funcionario import Funcionario


class Advogado(Funcionario):
    def __init__(self, nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo, matricula, setor, salario, oab: str) -> None:
        super().__init__(nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo, matricula, setor, salario)
        self.oab = oab

    def salario_final(self):
        return self.salario

    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nOAB: {self.oab}"

               )