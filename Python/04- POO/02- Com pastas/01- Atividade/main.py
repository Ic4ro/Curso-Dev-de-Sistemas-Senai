import os 

from models.pessoa import Pessoa
from models.enums.sexo import Sexo

os.system("cls || clear")

aluno = Pessoa("Icaro", 19, Sexo.MASCULINO)
print(aluno)