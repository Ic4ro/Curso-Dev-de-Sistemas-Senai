from models.enum.unidade_federativa import UnidadeFederativa

class Endereco: 
    def __init__(self, logradouro: str, numero: str, uf: UnidadeFederativa, complemento: str, cep: str, cidade: str) -> None:
        self.complemento = complemento
        self.cep = cep
        self.cidade = cidade
        self.longradouro = logradouro
        self.numero = numero 
        self.uf = uf 

    def __str__(self) -> str:
        return (
            f"\nLogradouro: {self.longradouro}"
            f"\nNúmero: {self.numero}"
            f"\nComplemento: {self.complemento}"
            f"\nCep: {self.cep}"
            f"\nCidade: {self.cidade}"
            f"\nUF - Nome: {self.uf.nome}"
            f"\nUF - Sigla: {self.uf.sigla}"
        )    