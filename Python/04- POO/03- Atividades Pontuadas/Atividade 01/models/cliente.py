from models.fisica import Fisica
from models.endereco import Endereco
from models.enum.sexo import Sexo

class Cliente(Fisica):
    def __init__(self, nome: str, telefone: str, email: str, endereco: Endereco, cpf: str, rg: str, data_nascimento: str, sexo: Sexo, protocolo_atendimento: int):
        super().__init__(nome, telefone, email, endereco, cpf, rg, data_nascimento, sexo)
        self.protocolo_atendimento = protocolo_atendimento

    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nCliente: {self.nome}"
                f"\nProtocolo: {self.protocolo_atendimento}"
               )