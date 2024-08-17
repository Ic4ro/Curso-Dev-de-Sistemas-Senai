import os
os.system("cls || clear")

# Atribuindo valores
primeiroNumero = float(input('Digite seu Primero Número: '))
segundaNumero = float(input('Digite seu Segundo Número: '))

# Calculando NÚmeros.
soma = primeiroNumero + segundaNumero
produto = primeiroNumero * segundaNumero
media = soma / 2
maiorNumero = max(primeiroNumero, segundaNumero)
menorNumero = min(primeiroNumero, segundaNumero)

if primeiroNumero == segundaNumero:
    print("Os números são iguais.")
else:
    print("Os números são diferentes.")

print("\n")


# Exibindo dados.
print(f"Primeiro Número: {primeiroNumero}")
print(f"Segundo Número: {segundaNumero}")
print(f"Média: {media}")
print(f"Produto: {produto}")
print(f"Maior Número: {maiorNumero}")
print(f"Menor Número: {menorNumero}")