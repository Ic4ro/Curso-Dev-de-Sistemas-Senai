import os
os.system("cls || clear")

# Atribuindo valores
primeiraNumero = float(input('Digite seu Primero Número: '))
segundaNumero = float(input('Digite seu Segundo Número: '))

# Calculando NÚmeros.
soma = primeiraNumero + segundaNumero
produto = primeiraNumero * segundaNumero
media = soma / 2
maiorNumero = max(primeiraNumero, segundaNumero)
menorNumero = min(primeiraNumero, segundaNumero)

print("\n")


# Exibindo dados.
print(f"Primeiro Número: {primeiraNumero}")
print(f"Segundo Número: {segundaNumero}")
print(f"Média: {media}")
print(f"Produto: {produto}")
print(f"Maior Número: {maiorNumero}")
print(f"Menor Número: {menorNumero}")