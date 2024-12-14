from models.funcionario import Funcionario

class Medico(Funcionario):
    def __init__(self, nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo, matricula, setor, salario, crm: str) -> None:
        super().__init__(nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo, matricula, setor, salario)
        self.crm = crm

    def salario_final(self):
        return self.salario

    def __str__(self) -> str:
        return (f"{super().__str__()}" 
                f"\nCRM: {self.crm}"

               )