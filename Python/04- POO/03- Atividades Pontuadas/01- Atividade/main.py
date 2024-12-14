import os

from models.enum.sexo import Sexo
from models.enum.setor import Setor
from models.enum.unidade_federativa import UnidadeFederativa
from models.endereco import Endereco
from models.cliente import Cliente
from models.enum.trabalho.motoboy import Motoboy
from models.enum.trabalho.medico import Medico
from models.enum.trabalho.advogado import Advogado

os.system("cls || clear")

# Criando um endereço fixo.
endereco = Endereco("Rua A", "123", UnidadeFederativa.BAHIA, "1 Andar", "4511111-122", "Salvador")      
    
cliente = Cliente("Icaro", "071...", "icaro@...", endereco, "12313131", "1313123", "1818", Sexo.MASCULINO, 123132)
print(cliente)

# Criando um Motoboy
motoboy = Motoboy("Jonas", "071...", "jonas123@...", endereco, "123.313.131-11", "121", "17/09/1999", Sexo.MASCULINO, "131313", Setor.OPERACOES, 1500, "11122")
print(motoboy)

# Criando um Médico
medico = Medico("Nando", "079...", "nando@...", endereco, "123.123.123-45", "12323313-32", "15/04/1975", Sexo.MASCULINO, "1231313", Setor.SAUDE, 3000, "221212")
print(medico)

# Criando um Advogado
advogado = Advogado("Marta", "051...", "Marta123@...", endereco, "123.123.123-41", "123131-11", "17/07/1997", Sexo.FEMININO, "454545", Setor.JURIDICO, 4000, "1313131")
print(advogado)
