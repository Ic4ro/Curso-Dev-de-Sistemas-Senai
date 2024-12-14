import os

from models.funcionario import Funcionario
from models.enum.sexo import Sexo
from models.enum.setor import Setor

os.system("cls || clear")

pessoa = Funcionario(123, "Icaro", 19, 1500, Sexo.MASCULINO, Setor.MAKETING)
print(pessoa)
