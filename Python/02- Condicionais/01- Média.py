import os
os.system("cls || clear")

# Solicitando dados.
nome = input('Digite seu nome: ')
idade = int (input('Digite sua idade: '))
primeiraNota = float(input('Digite sua nota: '))
segundaNota = float(input('Digite sua nota: '))
soma = primeiraNota + segundaNota

print("\n")
# Calculando notas.
media = soma / 2

# Exibindo dados.
print(f"Nome: {nome}")
print(f"Idade: {idade}")
print(f"Primeira Nota: {primeiraNota} ")
print(f"Segunda Nota: {segundaNota}")
print(f"Média: {media}")