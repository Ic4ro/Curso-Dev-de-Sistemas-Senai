from models.pessoa import Pessoa
from models.endereco import Endereco

class Juridica(Pessoa):
    def __init__(self, nome, telefone, email, endereco: Endereco, cnpj: str, inscricao_estadual: str) ->None:
        super().__init__(nome, telefone, email, endereco)
        self.cnpj = cnpj
        self.inscricao_estadual = inscricao_estadual

    def __str__(self) -> str:
        return ( 
                f"\nCNPJ: {self.cnpj}"  
                f"\nInscrição Estadual: {self.inscricao_estadual}")