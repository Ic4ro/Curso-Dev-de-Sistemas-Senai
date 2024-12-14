from models.funcionario import Funcionario

class Motoboy(Funcionario):
    def __init__(self, nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo, matricula, setor, salario, cnh: str) -> None:
        super().__init__(nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo, matricula, setor, salario)
        self.cnh = cnh

    def salario_final(self):
        return self.salario

    def __str__(self) -> str:
        return (f"{super().__str__()}" 
                f"\nCNH: {self.cnh}" 
               )