class Conta:
    def __init__(self, numero_conta: int, agencia: int) -> None:
        self._numero_conta = numero_conta
        self._agencia = agencia
        self._saldo = 0

    def depositar_negativo(self, saldo): 
        if saldo < 0: 
            self._saldo = 0
        else: 
            return self._saldo    
       
    def depositar(self, valor): 
        self._saldo += valor

    def sacar(self, valor): 
        self._saldo -= valor