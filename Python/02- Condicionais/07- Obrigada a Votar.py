import os
os.system("cls || clear")

# Atribuindo valores.
idade = int(input('Digite sua Idade: '))

# Verificando Dados.
if idade >= 18 and  idade < 65:
    print("São obrigados a votar.")
else:
    print("Não são obrigados a votar.")    