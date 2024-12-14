import os

from models.funcionario import Funcionario
from models.endereco import Endereco
from models.enum.unidade_federativa import unidadeFederativa
from models.enum.sexo import Sexo
from models.enum.setor import Setor

os.system("cls || clear")

pessoa = Funcionario(123, "Icaro", 19, 1500, Sexo.MASCULINO, Setor.ADVOGADO, "123.123.123.12", "123", "123", "17/07/20217", "07198898", "icaro@gmail...", 
                     Endereco("Rua A", "123", unidadeFederativa.BAHIA, "1 Andar", "444444-41", "Salvador"))
print(pessoa)